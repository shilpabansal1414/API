package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethod;
import org.testing.utilities.JsonRead;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.RandomNumber;
import org.testing.utilities.VariableReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_putRequest
{
   @Test
	public void tc5() throws IOException
 {
	Properties probject= PropertiesRead.PropertyFileRead("../APIFRAME/URI.properties");
	String bodydata=JsonRead.ReadJsonData("../APIFRAME/src/test/java/org/testing/resources/requestpayloadforput.json");
	bodydata=VariableReplacement.variablevalue(bodydata, "id", RandomNumber.RandomNo().toString());
	
	HTTPMethod http= new HTTPMethod(probject);
	Response r=http.PutRequest(bodydata, "QA_URI_API", TC1_postRequest.id);
	System.out.println("Status code is :" +r.statusCode());
	System.out.println("Data is " + r.asString());
	
	
	
 }
}
