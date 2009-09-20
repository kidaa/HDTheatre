package com.sony.xmb.demo1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public abstract  class CategoryAdapterBase extends XmbAdapterBase {

	public CategoryAdapterBase(Context context, ArrayList<XmbApplicationInfo> apps,
			Activity act)  {
		super(context,apps,act);
		
	}

}
