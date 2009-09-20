package com.sony.xmb.demo1;



import java.util.ArrayList;


import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class SmartXmb extends SmartXmbBase { 
        
	    Context mContext;
	    private static View mfocusedView = null;
			
	    public SmartXmb(Context context)  {
	    
	    super();
	    XmbUtil.instance(context);	
	    XmbLayoutParam  outParam = XmbUtil.getLayoutParam();
	
	    mContext = context;
	    
		XMBCategory xmb_x;
			    		
		/*----end DB debug------*/
		LinearLayout out_layout = new LinearLayout(context);
		out_layout.setOrientation(LinearLayout.HORIZONTAL); 
		out_layout.setBaselineAligned(false);
		out_layout.setBackgroundDrawable(Drawable.createFromPath(outParam.mBackgroundImage));   
		
		LinearLayout layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.HORIZONTAL); 
		LinearLayout.LayoutParams  param = new LinearLayout.LayoutParams (LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT);
		//layout.setBackgroundColor(Color.RED);
		layout.setLayoutParams(param);
		layout.setVisibility(View.VISIBLE);
		
		out_layout.addView(layout);
		/* XMB_X */
		XMBPlugInBase.isSubMenu = false;
		ArrayList<XmbApplicationInfo> apps =XmbUtil.getAllCategory();  
			
		xmb_x = new XMBCategory(context,apps.size(), layout);
		xmb_x.setAdapter(new CategoryAdapter(context,apps,(Activity)context));
		xmb_x.setOnItemSelectedListener(xmb_x);
		xmb_x.setFocusable(true);
		xmb_x.setPosition(-450, -160);
		layout.addView(xmb_x);
		
		for(int i = 0; i < apps.size(); i++)  {
			ArrayList<XmbApplicationInfo>   yApps = 
	     		XmbUtil.loadAppList((String)apps.get(i).title,"root");
			if(yApps.size() > 0)  {
			   this.createXmbY( xmb_x, i, layout, yApps);
			}
			
		}
	
        TopLayout top_layout = new 	TopLayout(context);
        top_layout.setOrientation(LinearLayout.HORIZONTAL); 
		LinearLayout.LayoutParams  top_param = new LinearLayout.LayoutParams (LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT);
		//top_layout.setBackgroundColor(Color.YELLOW);
		top_param.leftMargin = -800;
		top_layout.setLayoutParams(top_param);
		top_layout.setVisibility(View.VISIBLE);
		layout.addView(top_layout);
		
		/*Set layout */		
		((Activity)context).setContentView(out_layout);
	}
	
	    private XMBPlugIn createXmbY( XMBCategory xmb_x, int index,LinearLayout layout,
	    		ArrayList<XmbApplicationInfo> apps) {
			
			
			PlugInAdapter adapter = null;
			XMBPlugIn  xmb_y = null;
			XMBPlugInInfo  info = new XMBPlugInInfo(3);
			xmb_y = new XMBPlugIn(mContext, info, (Activity)mContext,layout );
					
			adapter = PlugInAdapter.instance(mContext, apps, info,(Activity)mContext);
			
					
			
			xmb_y.setAdapter(adapter);
			//xmb_y.setPosition(-500, 45 );
			xmb_y.setSelection(XmbUtil.getDefaultStart(apps.size()));
						
			xmb_y.setPlugInParent((View)xmb_x);
			
	        xmb_x.setXMBPlugIn(index,xmb_y);
			xmb_y.setVisibility(View.INVISIBLE);
			xmb_y.setPosition(XMBPlugInInfo.top_x_pos, XMBPlugInInfo.top_y_pos ); 

			
			layout.addView(xmb_y);
			
			return xmb_y;
		}
		
		
	@Override
	public int setBackgroundColor(int color) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBackgroundDrawable(Drawable icon) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addCategory(int index, CategoryInfo info) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int addPlugInForCategory(int index, PlugInInfo info) {
		// TODO Auto-generated method stub
		return 0;
	}

	static public View getCurrentFocus(){
		return mfocusedView;
	}
	
	static public void setCurrentFocus(View v){
		mfocusedView = v;
	}
}
