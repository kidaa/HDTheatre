package com.sony.xmb.demo1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.widget.BaseAdapter;

public abstract class XmbAdapterBase extends BaseAdapter {

	protected  Activity mActivity;
	protected  ArrayList<XmbApplicationInfo>  mApplications = null;
	
	public XmbAdapterBase( Context context, ArrayList<XmbApplicationInfo> apps,
			Activity act) {
		 if (mApplications == null) {
			   mApplications = apps;
			 }
		 mActivity = act;
	}
	
	public int getCount() { 
		return mApplications.size();
	}

	public long getItemId(int position) {
		return position;
	}
}
