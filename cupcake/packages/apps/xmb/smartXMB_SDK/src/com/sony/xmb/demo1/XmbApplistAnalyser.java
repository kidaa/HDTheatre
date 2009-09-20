package com.sony.xmb.demo1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;

import com.sony.xmb.demo1.XMBXmlAnalyser;


public class XmbApplistAnalyser extends XMBXmlAnalyser {

	private enum  ElementType{
	     CATEGORY_START,
	     CATEGORY_END,
	     PACKAGE_START,
	     PACKAGE_END,
	     NO_TYPE,
	};
	private static String mCategory = "no category";
	private static String mCategoryType = "no type";
	public XmbApplistAnalyser(Context _context, String xmlFileName ) {
		super(_context,xmlFileName);
		// TODO Auto-generated constructor stub
	}
	
	protected void parserXML(XmlPullParser parser)
	throws XmlPullParserException, IOException{
	
	int eventType = parser.getEventType();
	while(eventType != XmlPullParser.END_DOCUMENT){
		if(eventType == XmlPullParser.START_DOCUMENT){
			Log.v("APPLIST","XML Start");
		}else if(eventType == XmlPullParser.END_DOCUMENT){
			Log.v("APPLIST","XML END");
		}else if(eventType == XmlPullParser.START_TAG &&
				parser.getName() == "category"){
			Log.v("APPLIST","Start TAG:" + parser.getName());
			parserCategory(parser);
		}else if(eventType == XmlPullParser.END_TAG &&
				 parser.getName() == "category"){
			Log.v("APPLIST","END TAG:" + parser.getName());
		}else if(eventType == XmlPullParser.START_TAG &&
				parser.getName() == "package"){
			Log.v("APPLIST","Start TAG:" + parser.getName());
			packageAnalyse(parser,mCategory,"root","root");
		}else if(eventType == XmlPullParser.END_TAG &&
				parser.getName() == "package"){
			Log.v("APPLIST","END TAG:" + parser.getName());
		}else if(eventType == XmlPullParser.START_TAG &&
				parser.getName() == "XMB"){
			//parserVersion(parser);
		}
		eventType = parser.next();
	}
}
	
	private ArrayList<XmlAttribute> insertToDb(String category,	String parentPackage,
			String Package, String icon, String className)  {
		ArrayList<XmlAttribute> attrs = new ArrayList<XmlAttribute>();
		attrs.clear();
		attrs.add(new XmlAttribute(XmbApplistDbAdapter.KEY_CATEGORY, category));
		attrs.add(new XmlAttribute(XmbApplistDbAdapter.KEY_PPACKAGE, parentPackage));
		attrs.add(new XmlAttribute(XmbApplistDbAdapter.KEY_PACKAGE, Package));
		attrs.add(new XmlAttribute(XmbApplistDbAdapter.KEY_ICON, icon));
		attrs.add(new XmlAttribute(XmbApplistDbAdapter.KEY_CLASS, className));
		return attrs;
	}
	
	private void packageAnalyse(XmlPullParser parser,String Category, 
			String ParentPackage, String CurrentPackage)
    throws XmlPullParserException, IOException{
	ElementType type = ElementType.NO_TYPE;
	if(mCategoryType.equalsIgnoreCase("google.all")){
		return;
	}
	while(true){
			type = getTag(parser);
			if(type == ElementType.PACKAGE_START){
				String packageName = parser.getAttributeValue(null, XmbApplistDbAdapter.KEY_PACKAGE);
				String className = parser.getAttributeValue(null, XmbApplistDbAdapter.KEY_CLASS);
				String icon = parser.getAttributeValue(null, XmbApplistDbAdapter.KEY_ICON);
				parser.next();
				packageAnalyse(parser, Category, CurrentPackage, packageName);
	            mDbAdapter.insertApp(insertToDb(Category,CurrentPackage,packageName,icon,className));
				if(ParentPackage == CurrentPackage){
					return;
				}
			}
			else if(type == ElementType.PACKAGE_END){
				return;
			}
			parser.next();
    }
	
}

private void parserCategory(XmlPullParser parser)
	throws XmlPullParserException, IOException{
	mCategory = parser.getAttributeValue(null, "name");
	mCategoryType = parser.getAttributeValue(null, "type");
	Log.v("APPLIST","Category Name: " + mCategory);
	Log.v("APPLIST","Category Type: " + mCategoryType);
	if(mCategoryType.equalsIgnoreCase("google.all")){
		PackageManager manager = mcontext.getPackageManager();
		Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
        mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);

        final List<ResolveInfo> apps = manager.queryIntentActivities(mainIntent, 0);
        Collections.sort(apps, new ResolveInfo.DisplayNameComparator(manager));
		
		
		if (apps != null) {
			final int count = apps.size();
			for (int i = 0; i < count; i++) {
				ResolveInfo info = apps.get(i);
				String pname = info.activityInfo.packageName;
				String cname = info.activityInfo.name;
				if(cname != null){
					mDbAdapter.insertApp(insertToDb(mCategory, "root", pname,"", cname));
				}
			}
		}
	}
}


private static ElementType getTag(XmlPullParser parser)
throws XmlPullParserException, IOException{
ElementType type = ElementType.NO_TYPE;

int eventType = parser.getEventType();
if(eventType == XmlPullParser.START_DOCUMENT){
}else if(eventType == XmlPullParser.END_DOCUMENT){
}else if(eventType == XmlPullParser.START_TAG &&
		parser.getName() == "category"){
	type = ElementType.CATEGORY_START;
}else if(eventType == XmlPullParser.END_TAG &&
		parser.getName() == "category"){
	type = ElementType.CATEGORY_END;
}else if(eventType == XmlPullParser.START_TAG &&
		parser.getName() == "package"){
	type = ElementType.PACKAGE_START;
}else if(eventType == XmlPullParser.END_TAG &&
		parser.getName() == "package"){
	type = ElementType.PACKAGE_END;
}
return type;
}



}
