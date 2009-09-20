package com.sony.xmb.demo1;

import android.graphics.drawable.Drawable;

public interface SmartXmbInterface {
	
	
	abstract public int setBackgroundColor(int color);
	abstract public int setBackgroundDrawable(Drawable icon);
	abstract public int addCategory(int index, CategoryInfo info);
	abstract public int addPlugInForCategory(int index, PlugInInfo info);

}
