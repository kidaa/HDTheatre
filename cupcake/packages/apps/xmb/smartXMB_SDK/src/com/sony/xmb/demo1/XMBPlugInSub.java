package com.sony.xmb.demo1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class XMBPlugInSub extends XMBPlugInSubBase implements  View.OnClickListener{

	public XMBPlugInSub(Context context, XMBPlugInInfo info,Activity act,LinearLayout layout) {
		super(context,info,act,layout);
		/*unwrapAnimation = new TranslateAnimation((float)150.0f, (float)0.0f,(float)0.0f,  (float)0.0f);
		unwrapAnimation.setDuration(1500);
		unwrapAnimation.setInterpolator(new DecelerateInterpolator(7.0f)); 
		
		wrapAnimation = new TranslateAnimation((float)-150.0f, (float)0.0f,(float)0.0f,  (float)0.0f);
		wrapAnimation.setDuration(1500);
		wrapAnimation.setInterpolator(new DecelerateInterpolator(7.0f)); */
				

	}
    public void setParentMode() {
    	((XMBPlugInBase)this.mParent).hideParentMode();
		this.setVisibility(View.INVISIBLE);
		//LinearLayout.LayoutParams params1 = 
		//	(android.widget.LinearLayout.LayoutParams) this.mArrowView.getLayoutParams();
		//params1.leftMargin -= 250;
				
		PlugInSubAdapter ad = (PlugInSubAdapter) this.getAdapter();
		if(this.mParentModeView == null) {
								
			mParentModeView = new ImageView(mContext);
			XmbApplicationInfo  info = ad.mApplications.get(this.getSelectedItemPosition());
			mParentModeView.setImageDrawable(info.icon);	
			
			LinearLayout.LayoutParams params =
				new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT);
			params.topMargin = XMBPlugInInfo.parent_y_pos;
			params.leftMargin = XMBPlugInInfo.parent_x_pos;
			params.gravity = Gravity.CENTER_HORIZONTAL |Gravity.CENTER_VERTICAL ;
			mParentModeView.setLayoutParams(params);
			mParentModeView.setScaleType(ImageView.ScaleType.CENTER);
			mParentModeView.setVisibility(View.VISIBLE);
			mLayout.addView(mParentModeView);
			
			mParentArrowView = new ImageView(mContext);
			mParentArrowView.setImageResource(R.drawable.scroll_left_78x24);
			LinearLayout.LayoutParams params1 =
				new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT);
			params1.topMargin = XMBPlugInInfo.parent_y_pos;
			params1.leftMargin = XMBPlugInInfo.parent_x_pos - 100;
			params1.gravity = Gravity.CENTER_HORIZONTAL |Gravity.CENTER_VERTICAL ;
			mParentArrowView.setLayoutParams(params1);
			mParentArrowView.setScaleType(ImageView.ScaleType.CENTER);
			mParentArrowView.setVisibility(View.VISIBLE);
			mLayout.addView(mParentArrowView);
			
		} else {
		//	XmbApplicationInfo  info = ad.mApplications.get(this.getSelectedItemPosition());
		//	mParentModeView.setImageDrawable(info.icon);	
			mParentModeView.setVisibility(View.VISIBLE);
			mParentArrowView.setVisibility(View.VISIBLE);
			
		}
    	
	}
	
	
    public void restoreFromParentMode()  {
		this.showView(View.VISIBLE);
		mParentModeView.setVisibility(View.INVISIBLE);
		if(mParentArrowView != null)  {
			mParentArrowView.setVisibility(View.INVISIBLE);	
		}
			
	//	LinearLayout.LayoutParams params1 = 
	//		(android.widget.LinearLayout.LayoutParams) this.mArrowView.getLayoutParams();
	//	params1.leftMargin += 250;
		
		((XMBPlugInBase) this.mParent).setParentMode();
	//	((XMB_Y_Basic) this.mParent).showView(View.VISIBLE);
		this.setFocusable(true);
		this.requestFocus();
	 //this.setSelection(this.getSelectedItemPosition());   
		
		layout_pos_params = (android.widget.LinearLayout.LayoutParams) mLayout.getLayoutParams();
		layout_pos_params.leftMargin += XMBPlugInInfo.SUBMENU_SPACE;
		mLayout.setLayoutParams(layout_pos_params);
		mLayout.startAnimation(wrapAnimation);
	}
	
	public XMBPlugInSubBase createSub(ArrayList<XmbApplicationInfo> apps)  {
		XMBPlugInSub child = null;
		XMBPlugInInfo  newInfo = new XMBPlugInInfo(0); 
		PlugInSubAdapter newAd = new PlugInSubAdapter(
				 this.mContext, apps, newInfo,this.mActivity);
				
		child = new XMBPlugInSub(this.mContext, newInfo,mActivity,mLayout);
		child.setPlugInParent((View)this);
		child.setAdapter(newAd);
		child.setPosition(XMBPlugInInfo.leaf_x_pos, XMBPlugInInfo.leaf_y_pos);
		child.setSelection(0);
		
		child.createArrow();
	//	child.setVisibility(View.INVISIBLE);
		mLayout.addView(child);
		
		layout_pos_params = (android.widget.LinearLayout.LayoutParams) mLayout.getLayoutParams();
		layout_pos_params.leftMargin -= XMBPlugInInfo.SUBMENU_SPACE;
		mLayout.setLayoutParams(layout_pos_params);
		
		mLayout.startAnimation(unwrapAnimation);
		
		return child;
	}
	
	@Override
	public  void onClick (View v) {
		return;
	}
		    
	/*@Override
	public boolean onTouchEvent (MotionEvent event)  {
		Toast.makeText(mContext, "Y-Sub: OnTouchEvent", Toast.LENGTH_SHORT).show();
		if(this.isFocusable()) Toast.makeText(mContext, "Y-Sub: Focusable", Toast.LENGTH_SHORT).show();
		if(this.isFocused()) Toast.makeText(mContext, "Y-Sub: Focused", Toast.LENGTH_SHORT).show();
		return true;
	}*/
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
			
		super.onKeyDown(keyCode, event);

		return true;
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public XmbComponentType getType() {
		return XmbComponentInterface.XmbComponentType.XMB_PLUIN_SUB_MENU;
	}
	
}
