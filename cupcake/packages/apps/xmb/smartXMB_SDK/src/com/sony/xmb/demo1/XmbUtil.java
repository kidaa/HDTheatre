package com.sony.xmb.demo1;

import java.util.ArrayList;


import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.Log;


class XmbLayoutParam {
	public int mMarginLeft; 
	public int mMarginTop;
	public int mSpace;
	public String mBackgroundImage;
	
		
}

public class XmbUtil {
	public static XmbApplistAnalyser mApplistParser;
	public static XmbApplistDbAdapter mApplistDb;
	public static XmbLayoutAnalyser mLayoutParser;
	public static XmbApplistDbAdapter mLayoutDb;
    private Context mContext; 
    private static XmbUtil mSelf = null;
    
        
    private XmbUtil( Context context ) {  
    	super();
    	mContext = context;
    	mApplistParser = new XmbApplistAnalyser(mContext,"applist.xml");
    	mApplistParser.AnalyseXmlFile();
    	mApplistDb = (XmbApplistDbAdapter) mApplistParser.mDbAdapter;
    	mApplistDb.open();
    	
    	
    	
    	mLayoutParser = new XmbLayoutAnalyser(mContext,"layout.xml");
    	//mLayoutParser.fillCategoryDb();
    	//mLayoutDb =  XmbApplistDbAdapter.getInstance(mContext,"XmbLayout.db","LayoutTable");
    	//mLayoutDb.open();
      	
				
    }
    
    static public XmbUtil instance(Context context) {
    	if(mSelf == null)  {
    	   mSelf = new XmbUtil(context);
    	}
    	return mSelf;
    }
    
    static public int getDefaultStart(int length) {
		if( length < XMBPlugInInfo.mFocuseStart + 1)  {
		       return 1;  		
			} 
			return XMBPlugInInfo.mFocuseStart;
		}
    
    public   XmbApplicationInfo loadAPK(String packageName, String className) {

            final Intent intent = new Intent(Intent.ACTION_MAIN, null);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            final PackageManager packageManager = mContext.getPackageManager();
            
            final ComponentName cn = new ComponentName(packageName,className);
            intent.setComponent(cn);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    
            XmbApplicationInfo info;
            info = getAPKInfo(packageManager, intent);
          
    	    return info;
    	    	
	}
	
	private static XmbApplicationInfo getAPKInfo(PackageManager manager, Intent intent) {
	    final ResolveInfo resolveInfo = manager.resolveActivity(intent, 0);
	
	    if (resolveInfo == null) {
	        return null;
	    }
	
	    final PlugInLeafInfo info = new PlugInLeafInfo();
	    final ActivityInfo activityInfo = resolveInfo.activityInfo;
	    info.icon = activityInfo.loadIcon(manager);
	    if (info.title == null || info.title.length() == 0) {
	        info.title = activityInfo.loadLabel(manager);
	    }
	    if (info.title == null) {
	        info.title = "";
	    }
	    info.setActivity(new ComponentName(
	    		resolveInfo.activityInfo.applicationInfo.packageName,
	    		resolveInfo.activityInfo.name),
	            Intent.FLAG_ACTIVITY_NEW_TASK
	            | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
	    return info;
	}

	public  XmbApplicationInfo loadParentMenu(String packagename, String classname,
			String icon) {
	    
		    PlugInParentInfo application = new PlugInParentInfo();
	        application.type = XmbApplicationInfo.ApplicationInfoType.PARENT_PLUGIN_INFO;
	        application.title = packagename;
	        application.icon = Drawable.createFromPath(icon);
	                
	        return application;
		}
		
				
		public boolean testIsStatic(String category, String ppackage){
			boolean result = false;
			
			ArrayList<XmlAttribute> attrs = new ArrayList<XmlAttribute>();
			attrs.clear();
			attrs.add(new XmlAttribute(XmbApplistDbAdapter.KEY_CATEGORY, category));
			attrs.add(new XmlAttribute(XmbApplistDbAdapter.KEY_PPACKAGE, ppackage));
			Cursor cursor = mApplistDb.fetchApp(attrs);
			
			if(cursor.getCount() != 0){
				result = true;
			}else{
				result = false;
			}
			return result;
		}
		
		public static  ArrayList<XmbApplicationInfo> loadAppList(String category, String ppackage) {
		    ArrayList<XmbApplicationInfo> mApplications  = new ArrayList<XmbApplicationInfo>();
			mApplications.clear();
			
			Cursor appCursor;
			ArrayList<XmlAttribute> attrs = new ArrayList<XmlAttribute>();
			attrs.clear();
			attrs.add(new XmlAttribute(XmbApplistDbAdapter.KEY_CATEGORY, category));
			attrs.add(new XmlAttribute(XmbApplistDbAdapter.KEY_PPACKAGE, ppackage));
	        appCursor = mApplistDb.fetchApp(attrs);
	        
	        int packageIdx = appCursor.getColumnIndexOrThrow(XmbApplistDbAdapter.KEY_PACKAGE);
	        int classIdx = appCursor.getColumnIndexOrThrow(XmbApplistDbAdapter.KEY_CLASS);
	        int iconIdx = appCursor.getColumnIndexOrThrow(XmbApplistDbAdapter.KEY_ICON);
	       
	        if(appCursor.moveToFirst()){
	        	do{
	        		//Extract package
	        		String packageName = appCursor.getString(packageIdx);
	       		String className = appCursor.getString(classIdx);
	       		String icon = appCursor.getString(iconIdx);
	       		XmbApplicationInfo application ;
	       		if(mSelf.testIsStatic(category,packageName))//parent
	        		{
	        			application = mSelf.loadParentMenu(packageName, className,icon);
	        		}
	        		else//leaf
	        		{
	        			application = mSelf.loadAPK(packageName, className);
	        		}
	        		
	               mApplications.add(application);
	        		
	        	}while(appCursor.moveToNext());
	        } 
			return mApplications;
		
	}
		
	public static ArrayList<XmbApplicationInfo>  getAllCategory()  { 
		ArrayList<XmbApplicationInfo> categorys  = new ArrayList<XmbApplicationInfo>();
		categorys.clear();
		
		ArrayList<XmlItem> items = XmbUtil.mLayoutParser.GetItemsByTagName("category");
		
		for(int i = 0; i < items.size(); i++) {
		   	CategoryInfo info = new CategoryInfo();
		    info.title = items.get(i).getValue(XmbLayoutDbAdapter.KEY_CATEGORY);
		    info.type = XmbApplicationInfo.ApplicationInfoType.CATEGORY_INFO;
		    info.icon = Drawable.createFromPath(items.get(i).getValue(XmbLayoutDbAdapter.KEY_HI_ICON));
		    info.nrIcon = Drawable.createFromPath(items.get(i).getValue(XmbLayoutDbAdapter.KEY_NR_ICON));
		    categorys.add(info);
		    
		}
	    
		
		
		return categorys;
	}
	
	public static XmbLayoutParam  getLayoutParam()  {
		XmbLayoutParam  param = new XmbLayoutParam();
				
		ArrayList<XmlItem> items = XmbUtil.mLayoutParser.GetItemsByTagName("layout");
		
		param.mBackgroundImage = items.get(0).getValue("background");
		param.mMarginLeft =  Integer.valueOf(items.get(0).getValue("marginLeft"));
		param.mMarginTop =  Integer.valueOf(items.get(0).getValue("marginTop"));
		param.mSpace = Integer.valueOf(items.get(0).getValue("space"));
		
			
		return param;
	}
	
    
}
