package com.sony.xmb.demo1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.util.Log;

public class XmbApplistDbAdapter extends XMBDbAdapter {

	public static final String KEY_ID = "_id";
	public static final String KEY_CATEGORY = "category";
	public static final String KEY_PPACKAGE = "ppackage";
	public static final String KEY_PACKAGE = "package";
	public static final String KEY_ICON    = "icon";
	public static final String KEY_CLASS = "class";
	
	private static XmbApplistDbAdapter mSelf = null;
			  
	private XmbApplistDbAdapter(Context _context, int mVersion) {
		super(_context,mVersion);
		
	}
	
	public static  XmbApplistDbAdapter  getInstance(Context _context,String dbName, 
			String tableName, int mVersion) {
		
		if(mSelf == null)  {
			DATABASE_CREATE = 
				"create table " 
				+ tableName
				+" (_id integer primary key autoincrement, "
					+ "category text not null, "
					+ "ppackage text not null, "
					+ "package text not null, "
					+ "icon text not null,"
					+ "class text not null);";
			DATABASE_TABLE = tableName;
			DATABASE_NAME = dbName;
			DATABASE_VERSION = 1;
			
			mColumns = new String[] {
					KEY_ID,
					KEY_CATEGORY,
					KEY_PPACKAGE,
					KEY_PACKAGE,
					KEY_ICON,
					KEY_CLASS	
			};
			mSelf = new XmbApplistDbAdapter(_context,mVersion);
		}
		return mSelf;
		
	}
	
	
	
	
	

}
