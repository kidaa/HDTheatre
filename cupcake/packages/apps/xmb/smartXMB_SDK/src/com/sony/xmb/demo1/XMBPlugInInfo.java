package com.sony.xmb.demo1;

public class XMBPlugInInfo {
	/* 4 :3*/
	public static int top_x_pos = -685;
	public static int top_y_pos = 25;
	
	public static int top_offset = 3;
	
	/* 16 :9*/
	//public static int top_x_pos = -740;
	//public static int top_y_pos = -20;
	
	public static int leaf_x_pos = -650;
	public static int leaf_y_pos = 280;
	
	public static int parent_x_pos = -1480;
	public static int parent_y_pos = 18;
	
	public static final int SUBMENU_SPACE = 220;
	public static final int SUBMENU_DURATION = 1500;
	public static final float SUBMENU_FACTOR = 7.0f;
	public static final float SUBMENU_ZERO = 0.0f;
	
	// this value must more than 0
	static public int mFocuseStart = 3;
	private  int mFocuse = 3;
	XMBPlugInInfo(int val) {
		mFocuseStart = val;
		mFocuse = val;
	}
	
	public void setFocusePos(int focuse)  {
		mFocuse = focuse;
	}
	
//	public int getFocusePos()  {
//		return mFocuse;
//	}
}
