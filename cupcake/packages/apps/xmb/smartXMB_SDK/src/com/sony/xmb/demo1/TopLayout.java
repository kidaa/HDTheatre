package com.sony.xmb.demo1;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.Toast;


public class TopLayout extends LinearLayout {

	private Context mContext;
	public TopLayout(Context c){
		super(c);
		mContext = c;
	}
	
	public boolean onTouchEvent (MotionEvent event){
	   /* Toast.makeText(mContext, "TopLayout: onTouchEvent", Toast.LENGTH_SHORT).show();*/
		return true;
	}
}
