package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethod;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetRequest
{
 @Test
	public void TC2() throws IOException
 {
	Properties prObject= PropertiesRead.PropertyFileRead("../APIFRAME/URI.properties");
	HTTPMethod http=new HTTPMethod(prObject);
	Response res=http.GetRequest("QA_URI_API", TC1_postRequest.id);
	System.out.println("Status code is "+res.statusCode());
	System.out.println("Data is "+ res.asString());
 }
}
