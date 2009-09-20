package com.sony.xmb.demo1;

public interface XmbComponentInterface {
	enum XmbComponentType {
		XMB_CATEGORY_MENU,
		XMB_PLUGIN_MENU,
		XMB_PLUIN_SUB_MENU
	};
	
	abstract public void setParentMode();
	abstract public void restoreFromParentMode();
	abstract public XmbComponentType getType();  

}
