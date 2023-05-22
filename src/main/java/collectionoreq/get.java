package collectionoreq;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class get {
	@Test
	public void TC1() {
		// baseurl
		RestAssured.baseURI = "http://localhost:3000";
		
        Response resp = (Response) RestAssured.given().get("/posts/1").then().statusCode(200).extract().response();

		assertEquals(resp.getStatusCode(), 200);
		assertEquals(resp.jsonPath().getString("id"), "1");
		assertEquals(resp.jsonPath().getString("author"), "akash");
		// System.err.println();
	}
}
