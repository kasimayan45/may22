package restapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class exp6 {


 @Test
 public void test_deleteUser() {
  RestAssured.useRelaxedHTTPSValidation();
  
  RestAssured.baseURI ="https://reqres.in";
  
  RestAssured.when(). 
   delete("/api/users/2").
  then().
   statusCode(204).
   log().all();
}}