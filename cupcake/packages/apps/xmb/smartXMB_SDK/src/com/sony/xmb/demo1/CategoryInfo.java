package com.sony.xmb.demo1;

import java.util.ArrayList;

import com.sony.xmb.demo1.XmbApplicationInfo.ApplicationInfoType;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryInfo extends XmbApplicationInfo {

	protected int position;
	
	public CategoryInfo() {
		this.position = 0;		
	} 

	public int getCategoryPos(){
		return this.position;
		
	}
	
	public void setCategoryPos(int pos){
		this.position = pos;
	}
	
	@Override
	public ApplicationInfoType getType() {
		return XmbApplicationInfo.ApplicationInfoType.CATEGORY_INFO;
	}

	@Override 
	 public TextView   getTextView(View view) {
	    	 
	   final TextView textView = (TextView) view
				.findViewById(R.id.label_g);
	   textView.setTextColor(new ColorStateList(new int[][] {
				{ android.R.attr.state_selected, android.R.attr.state_active },
				new int[0], }, new int[] { Color.YELLOW, Color.YELLOW,
				Color.BLACK }));
	    textView.setText( this.title);
	   textView.setVisibility(View.INVISIBLE);
			
		return textView;
	}
	@Override
	public ImageView getImageView(View view) {
		final ImageView imageView = (ImageView) view.findViewById(R.id.image_g);
		imageView.setImageDrawable(this.icon);
        if(XMBPlugInBase.isSubMenu == true){
        	imageView.setVisibility(View.INVISIBLE);
        }
		return imageView;
	}

}
