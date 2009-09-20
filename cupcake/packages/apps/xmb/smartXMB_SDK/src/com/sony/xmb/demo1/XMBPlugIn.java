package com.sony.xmb.demo1;

import java.util.ArrayList;
import java.util.Timer;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
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
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import com.sony.xmb.demo1.*;



public class XMBPlugIn extends XMBPlugInBase implements 
         OnItemSelectedListener , View.OnClickListener {
        XMBPlugIn(Context context, XMBPlugInInfo info,Activity act,LinearLayout layout) {
		super(context,info,act,layout);
		startPostion = 1;
	}
	
	public void showView(int visibility)  {
		this.setVisibility(visibility);
	
	}
	
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		if(view != null){
			this.updateAllItem(view, position);
			this.mXmbYInfo.setFocusePos(position);
		}
	}
    
	private class UpdateTitleEntry implements Runnable {
   XMBPlugIn   mXmbY = null;
   UpdateTitleEntry( XMBPlugIn  y) {
			mXmbY = y;
		}
		@Override
		public void run() {
			mXmbY.isShowAllTitle = 0;
		    mXmbY.updateTitle();	
		}
		
	}
	
	public void callUpdateTitle()  {
		this.post(new UpdateTitleEntry(this));
	}
	
	public void updateTitle()  {
		int index = this.getSelectedItemPosition();
		View v = null;
		
		TextView tv = null;
		for (int i = 0; i < this.getChildCount(); i++) {
			v = (View) (this.getChildAt(i));
			tv = (TextView) v.findViewById(R.id.label);
	
	        if(i != index) {
	          CharSequence str =  tv.getText();
	          str = "";
	          tv.setText(str);
	             	  
	          }
	  	}

	}
	
	protected  void updateAllItem(View view, int position) {
//		ApplicationAdapter ad = (ApplicationAdapter) this.getAdapter();
		View v = null;
		ImageView iv = null;
		TextView tv = null;
		XmbApplicationInfo info = null;
		if(position == -1) {
		  position = this.getSelectedItemPosition();
		}
		
		if (position > 0) {
			for (int i = 0; i < this.getChildCount(); i++) {
				v = (View) (this.getChildAt(i));
				PlugInAdapter ad = (PlugInAdapter)this.getAdapter();
				if (i < (position - 1)) {
					info = ad.mApplications.get(i);
				} else  if (i == position - 1) {
					info = ad.mApplications.get(ad.mApplications.size() - 1);	
				} else {
					info = ad.mApplications.get(i - 1);
				}
				
				v.setTag(info);
				tv = info.getTextView(v);
				iv = info.getImageView(v);
				iv.setBackgroundResource(R.drawable.black);
				tv.setTextColor(new ColorStateList(new int[][] {
						{ android.R.attr.state_active },
						new int[0], }, new int[] { Color.WHITE,
						Color.WHITE }));
				
				 
		  	    if( (i == position) || ( isShowAllTitle == 1) ) {
					  tv.setText(info.title);
				} else {
					tv.setText("");	
				}
				
			}
			
			if(view == null)  {
			   view = (View) (this.getChildAt(this.getSelectedItemPosition()));
			}
			
			info = (XmbApplicationInfo) view.getTag();
			iv = info.getImageView(view); 
			tv = info.getTextView(view); 
			iv.setBackgroundResource(R.drawable.xmb_focus_4x3);
			tv.setTextColor(new ColorStateList(new int[][] {
			   { android.R.attr.state_active },
				new int[0], }, new int[] { Color.YELLOW,
				Color.YELLOW })); 
			
			
		}
		
		v = (View)(this.getChildAt(0));
		if(v != null)  {
	      int step = v.getHeight();
	    
	      if(position == XMBPlugInInfo.top_offset)  {
	    	this.setPosition(XMBPlugInInfo.top_x_pos, XMBPlugInInfo.top_y_pos ); 
	      } else if( position >  XMBPlugInInfo.top_offset)  {
	    	int pos =  XMBPlugInInfo.top_y_pos - (position - XMBPlugInInfo.top_offset)*step;
	    	this.setPosition(XMBPlugInInfo.top_x_pos, pos );
	      } else  {    // position <  XMBPlugInInfo.top_offset
	    	int pos =  XMBPlugInInfo.top_y_pos + (XMBPlugInInfo.top_offset - position)*step;
	    	this.setPosition(XMBPlugInInfo.top_x_pos, pos );
	      }
		}
	}
	
	
	
	public boolean onKeyDown(int keyCode, KeyEvent event) {
				
		if( (event.getKeyCode() == 20 ) ||
			(event.getKeyCode() == 19 )	
				)  {
		   if(mTitleTimer != null) {
		      mTitleTimer.cancel();
		      mTitleTimer = null;
		   } 
		
	    	mTitleTimer = new Timer();
	    	XMB_Y_Title_Timer_Task  task = new XMB_Y_Title_Timer_Task(this); 
	    	mTitleTimer.schedule(task, 5000);
		}
		
		super.onKeyDown(keyCode, event);

		return true;
	}
		
	public void setParentMode() { 
		
		 ((XMBCategory) this.mParent).setParentMode();
		this.setVisibility(View.INVISIBLE);
		PlugInAdapter ad = (PlugInAdapter) this.getAdapter();
		if(this.mParentModeView == null) {
								
			mParentModeView = new ImageView(mContext);
			View view =  this.getSelectedView();
			XmbApplicationInfo info = (XmbApplicationInfo) view.getTag();
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
		} else {
		//	View view =  this.getSelectedView();
		//	XmbApplicationInfo info = (XmbApplicationInfo) view.getTag();
		//	mParentModeView.setImageDrawable(info.icon);
			
			mParentModeView.setVisibility(View.VISIBLE);
		}
    	
	}
	
	public void restoreFromParentMode()  {
		
		this.setVisibility(View.VISIBLE);
		mParentModeView.setVisibility(View.INVISIBLE);
		((XMBCategory) this.mParent).restoreFromParentMode();
		this.setFocusable(true);
		this.requestFocus();
	//	this.setSelection(this.getSelectedItemPosition());
		
		layout_pos_params = (android.widget.LinearLayout.LayoutParams) mLayout.getLayoutParams();
		layout_pos_params.leftMargin += XMBPlugInInfo.SUBMENU_SPACE;
		mLayout.setLayoutParams(layout_pos_params);
		mLayout.startAnimation(wrapAnimation);
		
		XMBPlugInBase.isSubMenu = false;
	}
	
	public XMBPlugInSubBase createSub(ArrayList<XmbApplicationInfo> apps)  {
		XMBPlugInSub child = null;
		XMBPlugInInfo  newInfo = new XMBPlugInInfo(0); 
		PlugInSubAdapter newAd = new PlugInSubAdapter(
				 this.mContext, apps, newInfo,this.mActivity);
		 
		
		child = new XMBPlugInSub(this.mContext, newInfo,mActivity,mLayout);
		child.setPlugInParent((View)this);
		child.setAdapter(newAd);
		child.setPosition(XMBPlugInInfo.leaf_x_pos , XMBPlugInInfo.leaf_y_pos);
		child.setSelection(0);
		
		child.createArrow();
		mLayout.addView(child);
		
	    layout_pos_params = (android.widget.LinearLayout.LayoutParams) mLayout.getLayoutParams();
		layout_pos_params.leftMargin = -(XMBPlugInInfo.SUBMENU_SPACE + (XMBCategory.SPACE * ((XMBCategory) this.mParent).getSelectedIndex()));
		mLayout.setLayoutParams(layout_pos_params);
		mLayout.startAnimation(unwrapAnimation);
		
		XMBPlugInBase.isSubMenu = true;
	
		return child;
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		return;
	}
	
	/*@Override
	public boolean onTouchEvent (MotionEvent event)  {
		Toast.makeText(mContext, "Y: OnTouchEvent", Toast.LENGTH_SHORT).show();
		if(this.isFocusable()) Toast.makeText(mContext, "Y: Focusable", Toast.LENGTH_SHORT).show();
		if(this.isFocused()) Toast.makeText(mContext, "Y: Focused", Toast.LENGTH_SHORT).show();
		return true;
	}*/

	@Override
	public XmbComponentType getType() {
		return XmbComponentInterface.XmbComponentType.XMB_PLUGIN_MENU;
	}
}
