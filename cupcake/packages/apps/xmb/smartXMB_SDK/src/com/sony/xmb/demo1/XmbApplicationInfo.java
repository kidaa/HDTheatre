package com.sony.xmb.demo1;


import java.util.ArrayList;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class XmbApplicationInfo extends ApplicationInfo 
       implements XmbApplicationInterface {
	public enum  ApplicationInfoType{
	     PARENT_PLUGIN_INFO,
	     LEAF_PLUGIN_INFO,
	     CATEGORY_INFO
	};
	
	/**
	    * The child Applications.
	    */
	ArrayList<XmbApplicationInfo>  childs;
	
	/**
    * The application type.
    */
	ApplicationInfoType  type;
	
	 /**
     * The application name.
     */
    CharSequence title;
    
    /**
     * The application icon.
     */
    Drawable icon;

    /**
     * The application icon id.
     */
    int      iconId;   

    /**
     * The non focuse application icon id.
     */
    int      nrIconId;
    
    /**
     * The non focuse application icon.
     */
    Drawable      nrIcon;
    
    /**
     * When set to true, indicates that the icon has been resized.
     */
    boolean filtered; 

    /**
     * construct
     */
    public XmbApplicationInfo() {
    	childs = null;
    
    }
    
    @Override
	public CharSequence getTitle() {
		return this.title;
	}
  
       
    @Override
	public   int executeFunction(Object obj)  { //empty
       return XmbErrorDefine.XMB_SUCCESS;	
    }
    
   
}
