package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class ConversionJsonToXml 
{
	public String ConversionJsonToXml(String Json)
	{
		JSONObject js= new JSONObject(Json);
		String XMldata=XML.toString(Json);
		return XMldata;
		
		
	}

}
