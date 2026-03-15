package maven;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Api {

	public static void main(String[] args) {

		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().baseUri(baseURI).queryParam("key","qaclick123").body("{\r\n"
				+ "    \"location\": {\r\n"
				+ "        \"lat\": -20.383494,\r\n"
				+ "        \"lng\": 40.427362\r\n"
				+ "    },\r\n"
				+ "    \"accuracy\": 100,\r\n"
				+ "    \"name\": \"GSIT Office\",\r\n"
				+ "    \"phone_number\": \"(+91) 983 893 1234\",\r\n"
				+ "    \"address\": \"GrowSkillIT, Kannur\",\r\n"
				+ "    \"types\": [\r\n"
				+ "        \"Office\"\r\n"
				+ "    ],\r\n"
				+ "    \"website\": \"http://www.gsit.com\",\r\n"
				+ "    \"language\": \"English-IN\"\r\n"
				+ "}").when().post("maps/api/place/add/json").then().log().all().statusCode(200);
		
	}

}
