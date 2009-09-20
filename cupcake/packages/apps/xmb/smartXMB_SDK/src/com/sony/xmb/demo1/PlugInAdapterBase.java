package com.sony.xmb.demo1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class PlugInAdapterBase extends XmbAdapterBase {

	// private Context mContext; // 定义Context
	protected XMBPlugInInfo mPlugInInfo;
	    

	public PlugInAdapterBase(Context context, ArrayList<XmbApplicationInfo> apps,
			XMBPlugInInfo info,Activity act) {
		super(context,apps,act);
		this.mPlugInInfo = info;
			
	}

	
}
