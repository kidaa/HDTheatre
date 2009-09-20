package com.sony.xmb.demo1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.Xml;

import com.sony.xmb.demo1.XMBXmlAnalyser;


public class XmbLayoutAnalyser extends XMBXmlAnalyser {


	public XmbLayoutAnalyser(Context _context, String xmlFileName ) {
		super(_context,xmlFileName);
		// TODO Auto-generated constructor stub
	}
	
	
	protected void parserXML(XmlPullParser parser)
	throws XmlPullParserException, IOException{

	
    }
	
	public void fillCategoryDb() {
		ArrayList<XmlItem> items = this.GetItemsByTagName("category");
	//	for(int i = 0 ; i < items.size(); i++)  {
	//	  this.mDbAdapter.insertApp(items.get(i).mAttributeList);
	//	}
		
	}
	

}
