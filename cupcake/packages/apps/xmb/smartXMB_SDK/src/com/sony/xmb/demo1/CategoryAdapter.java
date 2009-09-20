package com.sony.xmb.demo1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryAdapter extends CategoryAdapterBase {

	
	public CategoryAdapter(Context context, ArrayList<XmbApplicationInfo> apps,
			Activity act) {
		super(context,apps,act);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			final LayoutInflater inflater = mActivity.getLayoutInflater();
			convertView = inflater.inflate(R.layout.main, parent, false);
		}

		this.mApplications.get(position).getImageView(convertView);
		this.mApplications.get(position).getTextView(convertView);
		((CategoryInfo)this.mApplications.get(position)).setCategoryPos(position);
		convertView.setTag(this.mApplications.get(position));
		
		return convertView;
		 
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

}
