package collectionoreq;

import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post {
	public void TC1() {
		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.given().contentType(ContentType.JSON)
		
		.body("{\n"+"    \"id\":1\n"
		+"       \"title\":\"raj\",\n"
	    +"    \"author\":\"akash\",\n  "
		+ "}\n"+""
		)
		.when().post("/posts");
		Response resp = (Response) RestAssured.given().get("/posts/1").then().statusCode(200).extract().response();

		assertEquals(resp.getStatusCode(), 201);
		assertEquals(resp.getStatusCode(), 200);
		assertEquals(resp.jsonPath().getString("id"), "1");
		assertEquals(resp.jsonPath().getString("author"), "akash");
		// System.err.println();
	}

}
