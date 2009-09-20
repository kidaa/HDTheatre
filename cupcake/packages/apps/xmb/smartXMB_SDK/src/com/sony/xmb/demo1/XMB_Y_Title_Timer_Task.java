package com.sony.xmb.demo1;

import java.util.TimerTask;

public class XMB_Y_Title_Timer_Task extends TimerTask {

	private XMBPlugIn mXmbY;
	XMB_Y_Title_Timer_Task( XMBPlugIn  xmb_y ) {
		super();
		mXmbY = xmb_y;
	}
	@Override
	public void run() {
		mXmbY.callUpdateTitle();
		
		mXmbY.mTitleTimer.cancel();
		mXmbY.mTitleTimer = null;
	
	}

}
