package com.sony.xmb.demo1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Gallery.LayoutParams;

public abstract class XMBPlugInSubBase extends XMBPlugInBase implements OnItemSelectedListener {

	protected ImageView mArrowView = null;
	private static final KeyEvent enterKeyEvent;
	
	public XMBPlugInSubBase(Context context, XMBPlugInInfo info,Activity act,LinearLayout layout) {
		super(context,info,act,layout);
		
				

	}
	
	
	static{
		enterKeyEvent = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER);
	}
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
	  updateAllItem(view, position);
	  this.mXmbYInfo.setFocusePos(position);
	}
	
	public void showView(int visibility)  {
		this.setVisibility(visibility);
		this.mArrowView.setVisibility(visibility);
	//	if(mParentArrowView != null) {
	//		mParentArrowView.setVisibility(visibility);
	//	}
	
 	}
	
	public void createArrow()  {
		if(mArrowView == null)  {
		   mArrowView = new ImageView(mContext);
		   mArrowView.setImageResource(R.drawable.scroll_left_78x24);
		   LinearLayout.LayoutParams params = 
			  new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT);
		   params.topMargin = XMBPlugInInfo.parent_y_pos;
		   params.leftMargin = XMBPlugInInfo.parent_x_pos + 150;
		   params.gravity = Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL;
		   mArrowView.setLayoutParams(params);
		   mArrowView.setScaleType(ImageView.ScaleType.CENTER);
		   mArrowView.setVisibility(View.VISIBLE);
		   mLayout.addView(mArrowView);
		} else {
			mArrowView.setVisibility(View.VISIBLE) ;
		}

	}
	
	
	protected  void updateAllItem(View view, int position) {
		ImageView iv = null;
		TextView  tv = null;
		View  v = null;
		if(position == -1) {
		  position = 0;
		}
		for (int i = 0; i < this.getChildCount(); i++) {
			v = (View) (this.getChildAt(i));
			iv = (ImageView) v.findViewById(R.id.image);
			iv.setBackgroundResource(R.drawable.black);
			tv = (TextView) v.findViewById(R.id.label);
			tv.setTextColor(new ColorStateList(new int[][] {
					{ android.R.attr.state_active },
					new int[0], }, new int[] { Color.WHITE,
					Color.WHITE }));
		}
		if(view == null)  {
		   view =  (View) (this.getChildAt( this.getSelectedItemPosition()));
		}
		
		if(view != null )  {
		   iv = (ImageView) view.findViewById(R.id.image);
		   iv.setBackgroundResource(R.drawable.xmb_focus_4x3);
		   tv = (TextView) view.findViewById(R.id.label);
		   tv.setTextColor(new ColorStateList(new int[][] {
					{ android.R.attr.state_active },
					new int[0], }, new int[] { Color.YELLOW,
					Color.YELLOW }));
		}
		
		v = (View)(this.getChildAt(0)); 
		if(v != null)  {
	       int step = v.getHeight();
	        
	       int pos =  XMBPlugInInfo.leaf_y_pos - position*step;
	       this.setPosition(XMBPlugInInfo.leaf_x_pos, pos );
		}
	   
	
	}
    
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		
		switch (event.getKeyCode()) {
        case KeyEvent.KEYCODE_DPAD_LEFT :
		/*case 4: //esc
*/		{   
			this.showView(View.INVISIBLE);
			XMBPlugInBase y = (XMBPlugInBase)this.mParent;
			//if(y.mChild != null ) {
				y.restoreFromParentMode();
			//}
			return true;
			//break;
		}
		case KeyEvent.KEYCODE_DPAD_RIGHT:
		{
			keyCode = KeyEvent.KEYCODE_ENTER;
			event = enterKeyEvent;
			break;
		}
	  	default: {
			break;
		}
		}
		super.onKeyDown(keyCode, event);
		event = null;
		return true;
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		return;

	}
	
}
