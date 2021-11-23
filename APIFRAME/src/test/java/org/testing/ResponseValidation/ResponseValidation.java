package org.testing.ResponseValidation;

import org.testing.utilities.JsonParsingUsingJsonPath;

import io.restassured.response.Response;

public class ResponseValidation 
{
 public static void statuscodevalidate(int ExpectedStatusCode, Response res)
 
 {
   if(ExpectedStatusCode==res.getStatusCode())
   {
	   System.out.println("Status code matched");
   }
   else
   {
	   System.out.println("Status code not matched");
   }
 }
 
 public static void dataValidation(String expecteddata, Response res, String jsonpath)
 {
	 String actualdata=JsonParsingUsingJsonPath.JsonParsingUsingjsonpath(jsonpath, res);
	 
	 if(actualdata.equals(expecteddata))
	 {
		 System.out.println("Data matched");
	 }
	 else
	 {
		 System.out.println("Data not matched");
	 }
 }
}
