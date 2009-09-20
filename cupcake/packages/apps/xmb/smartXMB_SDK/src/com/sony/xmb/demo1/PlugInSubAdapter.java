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

public class PlugInSubAdapter extends PlugInAdapterBase {

	
	public PlugInSubAdapter(Context context, ArrayList<XmbApplicationInfo> apps,
			XMBPlugInInfo info,Activity act) {
		super(context, apps,info,act);
	
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// final XmbInfo info = mApplications.get(position);

		if (convertView == null) {
			final LayoutInflater inflater = mActivity.getLayoutInflater();
			convertView = inflater.inflate(R.layout.param, parent, false);
		}
		
		this.mApplications.get(position).getImageView(convertView);
		this.mApplications.get(position).getTextView(convertView);
		
		convertView.setTag(this.mApplications.get(position));

		return convertView;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
