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

public class PlugInAdapter extends PlugInAdapterBase {

	private PlugInAdapter(Context context, ArrayList<XmbApplicationInfo> apps,
			XMBPlugInInfo info,Activity act) {
		super(context, apps,info,act);
		
	 	
	}

	public static PlugInAdapter instance(Context context, ArrayList<XmbApplicationInfo> apps,
			XMBPlugInInfo info,Activity act) {
		PlugInParentInfo inf = new PlugInParentInfo(); 
		inf.type = XmbApplicationInfo.ApplicationInfoType.PARENT_PLUGIN_INFO;
        inf.iconId = R.drawable.black;
        inf.title = "";
        apps.add(inf);
        return new PlugInAdapter(context,apps,info,act);
		
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// final XmbInfo info = mApplications.get(position);

		if (convertView == null) {
			final LayoutInflater inflater = mActivity.getLayoutInflater();
			convertView = inflater.inflate(R.layout.param, parent, false);
		}

		final int focuse = XmbUtil.getDefaultStart(this.mApplications.size());
		XmbApplicationInfo info = null;
		if (position < (focuse - 1)) {
			info = this.mApplications.get(position);
		} else  if (position == (focuse - 1)) {
			info = this.mApplications.get(this.mApplications.size() - 1);	
		} else {
			info = this.mApplications.get(position - 1);
		}
		final ImageView imageView = info.getImageView(convertView);
		final TextView textView = info.getTextView(convertView); 
		
		textView.setTextColor(new ColorStateList(new int[][] {
				{ android.R.attr.state_active },
				new int[0], }, new int[] { Color.WHITE,
				Color.WHITE }));

		 
		if (position == (focuse - 1)) {
			imageView.setImageResource(R.drawable.black);
			textView.setText("");
		} 
		convertView.setTag(info);

		return convertView;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

}
