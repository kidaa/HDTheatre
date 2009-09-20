package com.sony.xmb.demo1;

import java.util.ArrayList;

public interface XmbPlugInInterface extends XmbComponentInterface {

	abstract CharSequence  getParentTitle();
	abstract int  showChildView(ArrayList<XmbApplicationInfo> apps);
	abstract int  hideParentMode();
	abstract XMBPlugInSubBase createSub(ArrayList<XmbApplicationInfo> apps); 
}
