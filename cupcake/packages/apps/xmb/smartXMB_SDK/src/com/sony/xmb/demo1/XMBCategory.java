package com.sony.xmb.demo1;


import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class XMBCategory extends Gallery implements OnItemSelectedListener, View.OnClickListener,
           XmbCategoryInterface {
	private static XMBPlugIn current_y = null;   
    private Context mContext;
	private XMBPlugIn[] mXmbPlugInlist = null;
	private int mBranch_num;
	private int selected_index;
	private LinearLayout.LayoutParams pos_param;
	private Animation myAnimation_right;
	private Animation myAnimation_left;

	public static final int SPACE = 330;
	protected final int DURATION = 1500;
	protected final float FACTOR = 7.0f;
	protected final float ZERO = 0.0f;
	protected int startPosition = 0;
	protected LinearLayout mLayout;
	
	
	public XMBCategory(Context context, int branch_num, LinearLayout layout) {
		super(context);
		this.mContext = context;
		this.mBranch_num = branch_num;
		this.selected_index = 0;
		this.mLayout = layout;
		pos_param = new LinearLayout.LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
		if (mXmbPlugInlist == null) {
			mXmbPlugInlist = new XMBPlugIn[mBranch_num];
			
		}
	    this.setLayoutParams(pos_param);
	    this.setSpacing(0);
	    this.setAnimationDuration(0);
	    this.setFocusableInTouchMode(true);
	    myAnimation_left = new TranslateAnimation((float)-(SPACE/2), (float)ZERO,(float)ZERO,  (float)ZERO);
		myAnimation_left.setDuration(DURATION);
		myAnimation_left.setInterpolator(new DecelerateInterpolator(FACTOR));
		myAnimation_left.setAnimationListener(new ChangeLayoutPosOfCategory_left(this) );
		
		myAnimation_right = new TranslateAnimation((float)(SPACE/2), (float)ZERO, (float)ZERO, (float)ZERO);
		myAnimation_right.setDuration(DURATION);
		myAnimation_right.setInterpolator(new DecelerateInterpolator(FACTOR));
		myAnimation_right.setAnimationListener(new ChangeLayoutPosOfCategory_right(this) );
	}

   @Override	
   public  void setParentMode() {
	   //this.setVisibility(View.INVISIBLE);
	  /* for(int j = 0; j< this.getChildCount(); j++){
		   if (j == this.indexOfChild(this.getSelectedView())){
			   ((View)this.getSelectedView()).setVisibility(View.VISIBLE);
		   }else{
		   ((View)this.getChildAt(j)).setVisibility(View.INVISIBLE);
		   }
	   }*/
	   for(int j = 0; j < this.getChildCount(); j++){
		    View v = (View)(this.getChildAt(j)); 
			CategoryInfo  info =  (CategoryInfo)v.getTag();
			if(info.getCategoryPos() == this.getSelectedIndex()){
				v.setVisibility(View.VISIBLE);
			}else{
				v.setVisibility(View.INVISIBLE);
			}
	   }
   }
	
   @Override
	public  void restoreFromParentMode() {
		 for(int j = 0; j< this.getChildCount(); j++){
			  ((View)this.getChildAt(j)).setVisibility(View.VISIBLE);
		 }
	}

	public void setXMBPlugIn(int index, XMBPlugIn y) {
		if (mXmbPlugInlist == null) {
			mXmbPlugInlist = new XMBPlugIn[mBranch_num];
			
		}
		if(mXmbPlugInlist[index] == null)
			mXmbPlugInlist[index] = y;;
	
	}
	
	public XMBPlugIn getPlugIn(int index) {
		XMBPlugIn y = null;
		if (mXmbPlugInlist == null || index < 0 || index >mBranch_num) {
			return null;
		}
		
		return mXmbPlugInlist[index];

	}
	
	public void setPosition(int x, int y) {
		pos_param.leftMargin = x;
		pos_param.topMargin = y;
		this.setLayoutParams(pos_param);
	}

	public void changeFocusToY(){
		
		if(current_y != null){
			this.clearFocus();
			current_y.setFocusable(true);
		//	current_y.setSelection(current_y.getSelectedItemPosition());
			current_y.setSelected(true);
			current_y.requestFocus();
			
		}
	}
	
	public void changeFocustoX(){
		if(current_y != null){
			current_y.clearFocus();
    		this.setFocusable(true);
    		this.requestFocus();
		}
	}
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		Animation myAnimation_Scale = new ScaleAnimation(0.8f, 1.0f, 0.8f,
				1.0f, Animation.RELATIVE_TO_SELF, 0.5f,
				Animation.RELATIVE_TO_SELF, 0.5f);
		myAnimation_Scale.setDuration(50);
		myAnimation_Scale.setInterpolator(new DecelerateInterpolator(2.0f));

		int index_selected = ((Gallery) parent).indexOfChild(view);
		if (index_selected == -1 || this.getChildCount() == 0) {
			return;
		}
		
		for(int j = 0; j< this.getChildCount(); j++){
			View v = (View)(this.getChildAt(j)); 
			CategoryInfo  info =  (CategoryInfo)v.getTag();
			TextView tv = info.getTextView(v);
			ImageView iv = info.getImageView(v);
			if (j != index_selected){
		        tv.setVisibility(View.INVISIBLE);
		        iv.setImageDrawable(info.nrIcon);
			} else {
			  tv.setVisibility(View.VISIBLE);
			  iv.setAnimation(myAnimation_Scale);
			}
		}
	   //To Set Visibility to the correct ListView 
		for (int i = 0; i < mBranch_num; i++) {
		    if(mXmbPlugInlist[i] != null) {
				mXmbPlugInlist[i].setVisibility(View.INVISIBLE);
		    }
		}
		if(mXmbPlugInlist[position] != null)  {
			current_y = mXmbPlugInlist[position];
			current_y.setVisibility(View.VISIBLE);
			this.changeFocusToY();
		}
	}

	public void onNothingSelected(AdapterView<?> arg0) {
		Toast.makeText(mContext, "Nothing", Toast.LENGTH_SHORT).show();
	}
	
	/*public boolean onTouchEvent (MotionEvent event)  {
		Toast.makeText(mContext, "X: OnTouchEvent", Toast.LENGTH_SHORT).show();
		if(this.isFocusable()) Toast.makeText(mContext, "X: Focusable", Toast.LENGTH_SHORT).show();
		if(XMBPlugInBase.isSubMenu == true){
			this.clearFocus();
			this.setFocusable(false);
			this.setFocusableInTouchMode(false);
			
			if(this.isFocusable()) Toast.makeText(mContext, "X: Focusable 2", Toast.LENGTH_SHORT).show();
			if(this.isFocused()) Toast.makeText(mContext, "X: Focused 2", Toast.LENGTH_SHORT).show();
			XMBPlugInBase xmbplugin = (XMBPlugInBase)SmartXmb.getCurrentFocus();
			if(xmbplugin != null){
				xmbplugin.setFocusable(true);
				xmbplugin.setFocusableInTouchMode(true);
				xmbplugin.requestFocus();
				
			}
		}else{
		this.setFocusable(true);
		this.setFocusableInTouchMode(true);
		this.requestFocus();
		if(this.isFocused()) Toast.makeText(mContext, "X: Focused", Toast.LENGTH_SHORT).show();
		}
		return true;
	}*/
	
	
	/*protected void onFocusChanged (boolean gainFocus, int direction, Rect previouslyFocusedRect) {
		if(gainFocus) {
			Toast.makeText(mContext, "X : gainFocusChanged", Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(mContext, "X: lostFocusChanged", Toast.LENGTH_SHORT).show();
		}
	}*/
	
	@Override
	public void onClick(View arg0) {
		return;
		
	}
	public boolean onKeyDown (int keyCode, KeyEvent event) {
		/*Animation myAnimation_left, myAnimation_right;*/
		int index = this.getSelectedIndex();
		LinearLayout.LayoutParams layout_pos_params = (android.widget.LinearLayout.LayoutParams) mLayout.getLayoutParams();
		if (index == -1) {
			this.setSelection(0);
			return true;
		}
		
		switch (event.getKeyCode()) {
		case KeyEvent.KEYCODE_DPAD_LEFT: {
			if (index > startPosition) {
				layout_pos_params.leftMargin += SPACE;
				mLayout.setLayoutParams(layout_pos_params);
				this.mLayout.startAnimation(myAnimation_left);
			}
			
			break;
		}
		case KeyEvent.KEYCODE_DPAD_RIGHT: {
			if (index < (this.getBranchNum() - 1)) {
				layout_pos_params.leftMargin -= SPACE;
				mLayout.setLayoutParams(layout_pos_params);
				this.mLayout.startAnimation(myAnimation_right);
			} else {
				return true;
			}
			break;
		}
		case KeyEvent.KEYCODE_DPAD_DOWN:
		case KeyEvent.KEYCODE_DPAD_UP:
		{
			changeFocusToY();
			if(current_y != null){
				current_y.onKeyDown(keyCode, event);
			}
			break;
		}
		
		default: {
			super.onKeyDown(keyCode, event);
			break;
			}
		}
		return true;
		
	}
	
	public int getSelectedIndex(){
		return this.selected_index;
	}
	
	public int getBranchNum(){
		return this.mBranch_num;
	}
	
	public boolean setSelectedIndex(int index){
		if(index < 0 || index > (this.getBranchNum()-1)){
			return false;
		}
		else{
			this.selected_index = index;
			for(int j = 0; j< this.getChildCount(); j++){
				View v = (View)(this.getChildAt(j)); 
				CategoryInfo  info =  (CategoryInfo)v.getTag();
				TextView tv = info.getTextView(v);
				ImageView iv = info.getImageView(v);
				if (info.getCategoryPos() != this.selected_index){
			        tv.setVisibility(View.INVISIBLE);
			        iv.setImageDrawable(info.nrIcon);
				} else {
				  tv.setVisibility(View.VISIBLE);
				}
			}
			/*To Set Visibility to the correct ListView */
			for (int i = 0; i < mBranch_num; i++) {
			    if(mXmbPlugInlist[i] != null) {
					mXmbPlugInlist[i].setVisibility(View.INVISIBLE);
			    }
			}
			
			if(mXmbPlugInlist[this.selected_index] != null)  {
				current_y = mXmbPlugInlist[this.selected_index];
				current_y.setVisibility(View.VISIBLE);
				this.changeFocusToY();
			}else{
				current_y = null;
			}
			
		}
		return true;
	}
	
	@Override
	public XmbComponentType getType() {
		return XmbComponentInterface.XmbComponentType.XMB_CATEGORY_MENU;
	}
	
	public int getPlugInIndex(XMBPlugIn plugIn) {
		int i; 
		for(i = 0; i < this.mBranch_num; i++) {
			if( this.mXmbPlugInlist[i] == plugIn ) {
				break;
			}
		}
		return i; 
	}
	private final class ChangeLayoutPosOfCategory_left implements Animation.AnimationListener{
		private XMBCategory  mXMB_X;
		
		private ChangeLayoutPosOfCategory_left(XMBCategory x){
			mXMB_X = x;
		}
		
		@Override
		public void onAnimationEnd(Animation animation) {
			
			return;
			
		}

		@Override
		public void onAnimationRepeat(Animation animation) {
			return;
			
		}

		@Override
		public void onAnimationStart(Animation animation) {
			int index = mXMB_X.getSelectedIndex();
			if (index == -1) {
				mXMB_X.setSelectedIndex(0);
			}else if (index > startPosition){
				mXMB_X.setSelectedIndex(index -1);
			}
			return;
			
		}
		
	}

	private final class ChangeLayoutPosOfCategory_right implements Animation.AnimationListener{
		private XMBCategory  mXMB_X;
		
		private ChangeLayoutPosOfCategory_right(XMBCategory x){
			mXMB_X = x;
		}
		@Override
		public void onAnimationEnd(Animation animation) {
			return;
			
		}

		@Override
		public void onAnimationRepeat(Animation animation) {
			return;
			
		}

		@Override
		public void onAnimationStart(Animation animation) {
			int index = mXMB_X.getSelectedIndex();
			if (index == -1) {
				mXMB_X.setSelectedIndex(0);
			}else if (index < (mXMB_X.getBranchNum() - 1)){
				mXMB_X.setSelectedIndex(index + 1);
			}
			return;
			
		}
		
	}

}
