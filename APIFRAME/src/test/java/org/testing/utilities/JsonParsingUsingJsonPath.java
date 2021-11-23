package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath 
{
	public static String JsonParsingUsingjsonpath(String Jsonpath, Response res)
	
	{
	 return res.jsonPath().getString(Jsonpath).toString();
	}

}
