 package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethod 
{
	Properties pr;
 public HTTPMethod(Properties pr)
 {
	this.pr=pr; 
 }
  
 public Response PostRequest(String bodydata,String UriKey)
 {
	 Response res=
	given()
	.contentType(ContentType.JSON)
	.body(bodydata)
	.when()
	.post(pr.getProperty(UriKey));
	 return res;
	 //System.out.println("status code :" +res.statusCode());
	 
 }
 
 public Response GetRequest(String UriKey,String idValue)
 {
	 String base=pr.getProperty(UriKey);
	 String uri= base+"/"+idValue;
	 
	 Response res=
	 given()
	 .contentType(ContentType.JSON)
	 .when()
	 .get(uri);
	 return res; 
 }
 
 public Response GetAll(String UriKey)
 {
	 Response res=
	 given()
	 .contentType(ContentType.JSON)
	 .when()
	 .get(pr.getProperty(UriKey));
	 return res; 
 }
 
 public Response PutRequest(String bodyData,String UriKey,String Idvalue)
 {
	 String uri= pr.getProperty(UriKey)+ "/" + Idvalue;// base + endpoint
	 Response res=
	 given()
	 .contentType(ContentType.JSON)
	 .body(bodyData)
	 .when()
	 .put(uri);
	 return res;
	 
	 
 }
 
 public Response DeleteRequest(String UriKey,String IDvalue)
 {
	String Uri=pr.getProperty(UriKey)+"/" + IDvalue;	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.when()
	.delete(Uri);
	return res;
 }
}
