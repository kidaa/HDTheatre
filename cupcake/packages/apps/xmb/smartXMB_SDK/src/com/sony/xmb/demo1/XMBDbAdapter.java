package com.sony.xmb.demo1;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;


public class XMBDbAdapter {
	
	protected SQLiteDatabase mdb;
	protected xmbDbHelper mDbHelper;
	
	protected  final Context mcontext;
	protected static  String DATABASE_CREATE = null; 
	protected static  String DATABASE_TABLE = null;
	protected static  String DATABASE_NAME = null;
	protected static  int DATABASE_VERSION = -1;
	protected static String[] mColumns = null;
	
	private static class xmbDbHelper extends SQLiteOpenHelper{
		public xmbDbHelper(Context context, String name,
				           CursorFactory factory, int version){
			super(context, name, factory, version);
		}
		
		@Override
		public void onCreate(SQLiteDatabase db){
			db.execSQL(DATABASE_CREATE);
		}
		
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion,
				              int newVersion){
			Log.w("xmbDbHelper", "Upgrading from version " +
					             oldVersion + " to " + 
					             newVersion +
					             " , which will destroy all old data");
			db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
			onCreate(db);
		}
	}
	
	public XMBDbAdapter(Context _context){
		mcontext = _context;
		mDbHelper = new xmbDbHelper(mcontext, DATABASE_NAME, null,
				                    DATABASE_VERSION);
	}
	
	public XMBDbAdapter(Context _context, int version){
		mcontext = _context;
		mDbHelper = new xmbDbHelper(mcontext, DATABASE_NAME, null,
				                    version);
	}
	

	public XMBDbAdapter open() throws SQLException{
		try{
			mdb = mDbHelper.getWritableDatabase();
		}catch(SQLiteException e){
			mdb = mDbHelper.getReadableDatabase();
		}
		return this;
	}
	
	public void close() {
        mDbHelper.close();
    }
	
	public int getVersion(){
		return mdb.getVersion();
	}
	
	public long insertApp(ArrayList<XmlAttribute>  attrs ){
		ContentValues contentValues = new ContentValues();
		for(int i = 0; i < attrs.size(); i ++)  {
		   contentValues.put(attrs.get(i).mName,attrs.get(i).mValue);	
		}
				
		return mdb.insert(DATABASE_TABLE, null, contentValues);
	}
	
	public Cursor fetchApp(ArrayList<XmlAttribute>  attrs) throws SQLException {
		
		String where = null;
		StringBuilder s= new StringBuilder(attrs.size() * 24);
		for(int i = 0; i < attrs.size(); i++)  {
			if(i != 0) {
			  s.append(" and ");	
			}
			s.append(attrs.get(i).mName + " = '" + attrs.get(i).mValue + "'");
		}
	    where = s.toString();
		Log.v("APPLIST",where);
        Cursor mCursor =
                mdb.query(true, DATABASE_TABLE, mColumns, where, null,
                        null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }
	
	public Cursor fetchAllApps() {
		   Cursor cur = mdb.query(DATABASE_TABLE, mColumns, null, null, null, null, null);
		   
		   return cur;
    }
	

}