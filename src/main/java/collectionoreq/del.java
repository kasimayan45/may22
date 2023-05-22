package collectionoreq;

import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class del {
	public void TC1() {
		RestAssured.baseURI = "http://localhost:3000";
	
		Response resp = (Response) RestAssured.given().delete("/posts/8").then().statusCode(200).extract().response();
		assertEquals(resp.getStatusCode(), 200);

	
	}
}