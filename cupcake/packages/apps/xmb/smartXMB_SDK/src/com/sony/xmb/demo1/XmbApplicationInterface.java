package com.sony.xmb.demo1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public interface XmbApplicationInterface {
	
	abstract ImageView  getImageView(View view);
	abstract XmbApplicationInfo.ApplicationInfoType getType();
	abstract CharSequence getTitle();
	abstract TextView   getTextView(View view);
	abstract int executeFunction(Object obj);
	
	
}
