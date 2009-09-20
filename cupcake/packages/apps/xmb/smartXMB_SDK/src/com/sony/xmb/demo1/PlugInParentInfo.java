package com.sony.xmb.demo1;

import java.util.ArrayList;

import android.view.View;
import android.widget.ImageView;

public class PlugInParentInfo extends PlugInInfo {

	PlugInParentInfo()  {
		super();
	}
	
	
	@Override
	public ApplicationInfoType getType() {
		return XmbApplicationInfo.ApplicationInfoType.PARENT_PLUGIN_INFO;
	}


    @Override
	public   int executeFunction(Object obj)  { 
    	XMBPlugInBase plugIn = (XMBPlugInBase)obj;
    	ArrayList<XmbApplicationInfo>   apps = 
    		XmbUtil.loadAppList((String)plugIn.getParentTitle(), (String)title);
    	 plugIn.showChildView(apps);  	
    	 
       return XmbErrorDefine.XMB_SUCCESS;	
    }
    
	


}
