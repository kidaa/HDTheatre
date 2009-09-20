package com.sony.xmb.demo1;

import java.util.ArrayList;

public class XmlItem {
	public String mTagName;
	public ArrayList<XmlAttribute> mAttributeList;
	
	XmlItem(String tagName)  {
		mTagName = tagName;
		mAttributeList = new ArrayList();
		mAttributeList.clear();
	}
	public void addAttribute(XmlAttribute attr)  {
		mAttributeList.add(attr);
	}
	
	public XmlAttribute getAttribute(int index)  {
		return mAttributeList.get(index);
	}
	
   public String getValue(String attr)  {
	   for(int i = 0; i < mAttributeList.size(); i++)  {
		   if(mAttributeList.get(i).mName == attr) {
			   return mAttributeList.get(i).mValue;
		   }
	   }
	   return null;
		   
	}

}
