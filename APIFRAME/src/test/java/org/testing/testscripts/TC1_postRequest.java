package org.testing.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethod;
import org.testing.utilities.JsonRead;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.RandomNumber;
import org.testing.utilities.VariableReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

// before calling http method
//we should have body data and object of property class
// we need to change the id value manually

public class TC1_postRequest
{
   static String id;// use this variable when using this tc in tc2 
	//public static void main(String[] args) throws IOException //using this when run only tc1, while using in tc2 then design normal method
	@Test
   public void firstTC() throws IOException
	{
		Properties prObject=PropertiesRead.PropertyFileRead("../APIFRAME/URI.properties");
		String bodyData=JsonRead.ReadJsonData("../APIFRAME/src/test/java/org/testing/resources/RequestPayload.json");
		
		
		bodyData=VariableReplacement.variablevalue(bodyData, "id", RandomNumber.RandomNo().toString());//code is for generating id value automatically no need to change manually
		
		
		HTTPMethod http=new HTTPMethod(prObject);
		Response res=http.PostRequest(bodyData, "QA_URI_API");
		System.out.println("The status code is :"+res.statusCode() );
		System.out.println("Data is "+ res.asString() );
		id=res.jsonPath().get("id");
	}

}
