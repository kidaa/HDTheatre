package com.sony.xmb.demo1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.util.Log;

public class XmbLayoutDbAdapter extends XMBDbAdapter {

	public static final String KEY_ID = "_id";
	public static final String KEY_CATEGORY = "name";
	public static final String KEY_INDEX = "index";
	public static final String KEY_HI_ICON = "hi_icon";
	public static final String KEY_NR_ICON = "nr_icon";
	
	private static XmbLayoutDbAdapter mSelf = null;
	
			  
	private XmbLayoutDbAdapter(Context _context) {
		super(_context);
		
	}
	
	public static XmbLayoutDbAdapter getInstance(Context _context,String dbName, String tableName) {
		if(mSelf == null)   {
		  DATABASE_CREATE = 
			"create table appTable (_id integer primary key autoincrement, "
				+ "category text not null, "
				+ "index text not null, "
				+ "icon text not null, "
				+ "nrIcon text not null);";
		  DATABASE_TABLE = tableName;
		  DATABASE_NAME = dbName;
		  DATABASE_VERSION = 1;
		
		  mColumns = new String[] {
				KEY_ID,
				KEY_CATEGORY,
				KEY_INDEX,
				KEY_HI_ICON,
				KEY_NR_ICON	
		  };
		  mSelf = new XmbLayoutDbAdapter(_context);
		}
		return mSelf;
		
	}
	
	
	
	

}
