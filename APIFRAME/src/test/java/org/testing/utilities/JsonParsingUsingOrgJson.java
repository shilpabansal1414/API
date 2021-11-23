package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson
{
 public static void JsonParse(String responsedata, String KeyName)
 {
	 JSONArray data= new JSONArray(responsedata);
	 int Length=data.length();
	 for(int i=0;i<Length;i++)
	 {
		 JSONObject jo=data.getJSONObject(i);
		 System.out.println("id value is " + jo.get(KeyName));
	 }
	 
 }
}
