package com.sony.xmb.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.os.Environment;
import android.util.Log;
import android.util.Xml;

public abstract class XMBXmlAnalyser extends java.lang.Object {
	protected FileReader mFavReader;
	public  XMBDbAdapter mDbAdapter;
	protected final Context mcontext;
	private static int mVersion;
	private final File mFavFile;
	
	protected abstract void parserXML(XmlPullParser parser) 
	        throws XmlPullParserException, IOException;
	
	
	
	public XMBXmlAnalyser(Context _context, String xmlFileName){
		mcontext = _context;
		mDbAdapter = null;
		
		mFavFile = new File(Environment.getDataDirectory(), xmlFileName);
        try{
        	mFavReader = new FileReader(mFavFile);
        }catch(FileNotFoundException e){
        	Log.e("APPLIST","couldn't find or open applist xml" + mFavFile);
        	return;
        }
		
	} 
	
	public int AnalyseXmlFile(){
	
        try{
        	final XmlPullParser parser = Xml.newPullParser();
        	parser.setInput(mFavReader);
        	beginDocument(parser,"XMB");
        	if(parserVersion(parser)){
        		parserXML(parser);
        	}
        	
        	
        }catch(XmlPullParserException e){
        	Log.w("APPLIST","Got exception parsing favorites.", e);
        }catch(IOException e){
        	Log.w("APPLIST","Got exception parsing favorites.", e);
        }
        return 0; 
	}
	
	public int getVersion(){
		return mVersion; 
	}
	
	
	
	public boolean parserVersion(XmlPullParser parser)  
		throws XmlPullParserException, IOException{
		mVersion = Integer.valueOf(parser.getAttributeValue(null, "version"));
		if(mDbAdapter == null)  {
			mDbAdapter = XmbApplistDbAdapter.getInstance(mcontext,"XmbApplist.db","ApplistTable",
					mVersion);
			mDbAdapter.open();	
		}
		Cursor cursor = mDbAdapter.fetchAllApps();
		Log.v("APPLIST", "row count is: " + cursor.getCount());
		if(cursor.getCount() == 0){
			return true;
		}
		else{
			return false; 
		}
		
	} 
	
	public ArrayList<XmlItem> GetItemsByTagName(String tagName)  
	{
		ArrayList<XmlItem>  items = new ArrayList<XmlItem>();
		items.clear();
		
        try{
        	mFavReader = new FileReader(mFavFile);
        }catch(FileNotFoundException e){
        	Log.e("APPLIST","couldn't find or open applist xml" + mFavFile);
        	return null;
        }

		
	    try{
		  	final XmlPullParser parser = Xml.newPullParser();
		  	parser.setInput(mFavReader);
		   	int type = parser.getEventType();
		   	while(true)  {
		   	     
		   	     if(type == XmlPullParser.END_DOCUMENT) 
		   		    break;
		     	 if( (type == XmlPullParser.START_TAG)
		   	         &&(parser.getName() == tagName)) {
			   	 XmlItem item = new XmlItem(tagName);
		   	     for(int i = 0; i < parser.getAttributeCount(); i++) {
		    	 XmlAttribute attr = new XmlAttribute(parser.getAttributeName(i),
		    	 parser.getAttributeValue(i) );
		         item.addAttribute(attr);
		         }
		   	     items.add(item);
		      }  
		      type = parser.next();
		  }
  	    }catch(XmlPullParserException e){
		      	Log.w("APPLIST","Got exception parsing favorites.", e);
	    }catch(IOException e){
	       	Log.w("APPLIST","Got exception parsing favorites.", e);
	    }
	    return items;
    }
	
	protected static void beginDocument(XmlPullParser parser, String firstElementName)
	    throws XmlPullParserException, IOException {
	
		int type;
		while ((type = parser.next()) != XmlPullParser.START_TAG &&
		        type != XmlPullParser.END_DOCUMENT) {
		    // Empty
		}
		
		if (type != XmlPullParser.START_TAG) {
		    throw new XmlPullParserException("No start tag found");
		}
		
		if (!parser.getName().equals(firstElementName)) {
		    throw new XmlPullParserException("Unexpected start tag: found " + parser.getName() +
		            ", expected " + firstElementName);
		}
	}
}