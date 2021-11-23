package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethod;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_delete 
{
   @Test
	public void TC6() throws IOException
	{
		Properties pobject=PropertiesRead.PropertyFileRead("../APIFRAME/URI.properties");
		HTTPMethod http= new HTTPMethod(pobject);
		Response r=http.DeleteRequest("QA_URI_API", TC1_postRequest.id);
		System.out.println("Status code is :" +r.statusCode());
		System.out.println("data" +r.asString());
		
	}
}
