package com.sony.xmb.demo1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class PlugInInfo extends XmbApplicationInfo {

       public PlugInInfo()  {
    	   super();
       }
       
       @Override
   	   public ImageView getImageView(View view) {
   		final ImageView imageView = (ImageView) view.findViewById(R.id.image);
           imageView.setImageDrawable(icon);
   		return imageView;
   	}
       
       @Override 
       public TextView   getTextView(View view) {
       	 
   		final TextView textView = (TextView) view
   				.findViewById(R.id.label);
   		textView.setTextColor(new ColorStateList(new int[][] {
   				{ android.R.attr.state_selected, android.R.attr.state_active },
   				new int[0], }, new int[] { Color.YELLOW, Color.YELLOW,
   				Color.BLACK }));
   		textView.setText( this.title);
   		textView.setVisibility(View.VISIBLE);
   		
   		return textView;
       }

}
