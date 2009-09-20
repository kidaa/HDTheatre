package com.sony.xmb.demo1;

import java.util.ArrayList;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

public class PlugInLeafInfo extends PlugInInfo {

	 /**
     * The intent used to start the application.
     */
    Intent intent;

   	public PlugInLeafInfo() {
		intent = null;	
	}
	
	public int executeFunction()  {
		   return XmbErrorDefine.XMB_SUCCESS;	
	}
		
	@Override
	public ApplicationInfoType getType() {
		return XmbApplicationInfo.ApplicationInfoType.LEAF_PLUGIN_INFO;
	}

	public   int executeFunction(Object obj)  { 
    	XMBPlugInBase plugIn = (XMBPlugInBase)obj;
    	if(intent != null)  {
      	  plugIn.mActivity.startActivity(intent);	 
 	
         }
    	 return XmbErrorDefine.XMB_SUCCESS; 
	}
    		
	 /**
     * Creates the application intent based on a component name and various launch flags.
     *
     * @param className the class name of the component representing the intent
     * @param launchFlags the launch flags
     */
    final void setActivity(ComponentName className, int launchFlags) {
        intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(className);
        intent.setFlags(launchFlags); 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlugInLeafInfo)) {
            return false;
        }

        PlugInLeafInfo that = (PlugInLeafInfo) o;
        return title.equals(that.title) &&
                intent.getComponent().getClassName().equals(
                        that.intent.getComponent().getClassName());
    }

    @Override
    public int hashCode() {
        int result;
        result = (title != null ? title.hashCode() : 0);
        final String name = intent.getComponent().getClassName();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

}
