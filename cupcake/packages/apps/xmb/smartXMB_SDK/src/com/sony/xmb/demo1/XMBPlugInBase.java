package com.sony.xmb.demo1;


import java.util.ArrayList;
import java.util.Timer;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Rect;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;


public abstract  class XMBPlugInBase extends ListView   
implements XmbPlugInInterface { 
	ArrayList<XMBPlugInBase>  mChild;
	static public boolean isSubMenu = false;
	
	protected ImageView mParentModeView = null;
	protected ImageView mParentArrowView = null;
	protected Context mContext;
	protected Activity mActivity;
	protected LinearLayout mLayout;
    protected LinearLayout.LayoutParams pos_params;
	protected LinearLayout.LayoutParams pos_params_bk;
	protected LinearLayout.LayoutParams layout_pos_params;
	protected  int startPostion = 0;
	protected  int isShowAllTitle = 0;
	protected Animation wrapAnimation,unwrapAnimation; 
	
	public    Timer  mTitleTimer = null;
	public    XMBPlugInInfo mXmbYInfo;
    public View  mParent = null;
    
	
     XMBPlugInBase(Context context, XMBPlugInInfo info,Activity act,LinearLayout layout) {
		super(context);
		this.mContext = context;
		this.mXmbYInfo = info;
		this.mActivity = act;
		this.mLayout = layout;
		pos_params = new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,4000);
	    this.setLayoutParams(pos_params);
     //	this.setSelection(XMBPlugInInfo.mFocuseStart);
		this.setVerticalScrollBarEnabled(false);
	    this.setDivider(null);
	    this.setDividerHeight(0);
	    this.setSelector(R.drawable.black);
	    /*this.setClickable(false);*/
		this.setOnItemSelectedListener((OnItemSelectedListener) this);
		this.setFocusableInTouchMode(true);
		layout.setOrientation(LinearLayout.HORIZONTAL); 
		layout.setBaselineAligned(false);
		
		unwrapAnimation = new TranslateAnimation((float)(XMBPlugInInfo.SUBMENU_SPACE/2), (float)XMBPlugInInfo.SUBMENU_ZERO,(float)XMBPlugInInfo.SUBMENU_ZERO,  (float)XMBPlugInInfo.SUBMENU_ZERO);
		unwrapAnimation.setDuration(XMBPlugInInfo.SUBMENU_DURATION);
		unwrapAnimation.setInterpolator(new DecelerateInterpolator(XMBPlugInInfo.SUBMENU_FACTOR)); 
		
		wrapAnimation = new TranslateAnimation((float)-(XMBPlugInInfo.SUBMENU_SPACE/2), (float)XMBPlugInInfo.SUBMENU_ZERO,(float)XMBPlugInInfo.SUBMENU_ZERO,  (float)XMBPlugInInfo.SUBMENU_ZERO);
		wrapAnimation.setDuration(XMBPlugInInfo.SUBMENU_DURATION);
		wrapAnimation.setInterpolator(new DecelerateInterpolator(XMBPlugInInfo.SUBMENU_FACTOR));  
       
	}
	
    public int  getSelectedItemPosition() { 
    	int pos = super.getSelectedItemPosition();
    	if(pos < 0 )
    	  pos = XmbUtil.getDefaultStart(this.getAdapter().getCount());	 
		return pos;
       	
    	
    }
	protected abstract void updateAllItem(View view, int position);
	
	public abstract void showView(int visibility);  
	
	public int  hideParentMode()  {
		if(this.mParentArrowView != null)  {
		   this.mParentArrowView.setVisibility(View.INVISIBLE);
		}
		if(this.mParentModeView != null)   {
		  this.mParentModeView.setVisibility(View.INVISIBLE);
		}
		return 0;
	}
	
	
	@Override
	protected void onFocusChanged (boolean gainFocus, int direction, Rect previouslyFocusedRect) {
	    if(gainFocus == true)  {
	      // this.setSelection(this.getSelectedItemPosition());
	       this.updateAllItem(null, -1);
	       SmartXmb.setCurrentFocus((XMBPlugInBase)this);
	       /*Toast.makeText(mContext, "Y Base: gainFocusChanged", Toast.LENGTH_SHORT).show();*/
	     }   else  {
	    	 isShowAllTitle = 0;
	    	 if( mTitleTimer != null) {
	    		 mTitleTimer.cancel();
	    		 mTitleTimer = null;
	    	 }
	    	/* Toast.makeText(mContext, "Y Base: lostFocusChanged", Toast.LENGTH_SHORT).show();*/
	     }    
	    super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
	}

	
	public void setPlugInParent(View v) {
	  this.mParent = v; 	
	}
	
	public boolean isChildMode(){
		if (this.mParent == null){
			return false;
		}
		else{
			return true;
		}
	}
	
	public void setPosition(int x, int y) {
		pos_params.leftMargin = x;
		pos_params.topMargin = y;
		this.setLayoutParams(pos_params);
	}
	
	@Override
	public  int  showChildView(ArrayList<XmbApplicationInfo> apps)  {  
   	    if(apps.isEmpty() == false) {
		this.setParentMode(); 
		XMBPlugInBase child = createSub(apps);
		child.setFocusable(true);
		child.requestFocus();
	  }
		return 0;
	}
	 
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) { 
		int index = this.getSelectedItemPosition();
		isShowAllTitle = 1;
	//	Animation myAnimation_Scale = null;
		if (index == -1) {
			XmbUtil.getDefaultStart(this.getAdapter().getCount());
			return true;
		}
			  
	    View vi = (View)(this.getChildAt(0));
	  //   int step = vi.getHeight();

	
		switch (event.getKeyCode()) {
		case 20: { // down
			if (index < (this.getCount() - 1)) {
			//	myAnimation_Scale = new TranslateAnimation (0,
			//			0,0,0 - step );
			//	myAnimation_Scale.setDuration(200);
			//	this.setAnimation(myAnimation_Scale);
			//	pos_params.topMargin -= step;
			//	this.setLayoutParams(pos_params);
			}
			break;
		}
		case 19: { // up
			if (index > startPostion) {
			//	myAnimation_Scale = new TranslateAnimation (0,
			//			0,0,step );
			//	myAnimation_Scale.setDuration(200);
			//	this.setAnimation(myAnimation_Scale);
			//	pos_params.topMargin += step;
			//	this.setLayoutParams(pos_params);
			} else {
				return true;
			}
			break;
		}
		case 66: {
				View	view = this.getSelectedView(); 
				if(view != null)  {
				  XmbApplicationInfo info = (XmbApplicationInfo) view.getTag();	
		            
		          if(info != null) {
		          info.executeFunction(this);	
		          }
				}
	   		    break;
		 }		
		case KeyEvent.KEYCODE_DPAD_LEFT :
		case KeyEvent.KEYCODE_DPAD_RIGHT :
			if(this.mParent != null){
				this.mParent.setFocusable(true);
				this.mParent.setSelected(true);
				this.mParent.requestFocus();
				this.mParent.onKeyDown(keyCode, event);
				return true;
			}
		break;
		
		default: {
			break;
		}
		}

		super.onKeyDown(keyCode, event);

		return true;
	}

	@Override
	public CharSequence getParentTitle() {
		XMBPlugInBase p = this; 
	    while(true)  {
	    	if(p.getType() == XmbComponentInterface.XmbComponentType.XMB_PLUGIN_MENU) {
	    		break;
	    	}
	    	p =  (XMBPlugInBase) p.mParent;
	    }
	    XMBCategory x = (XMBCategory)p.mParent;
	    CategoryAdapter ad = (CategoryAdapter)(x.getAdapter()); 
	    CharSequence str =(ad.mApplications.get(x.getPlugInIndex((XMBPlugIn)p)).title);
		return str;
	} 
	
		
}
