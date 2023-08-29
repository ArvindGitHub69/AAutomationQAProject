package org.QA.FunctionAPI;

import org.QA.Util.Config;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class PetStore {

	public static String URL;
	public static String endpoint;
	
	@BeforeTest
	public void Initialization() {
		Config.init();
		URL = Config.prop.getProperty("BasePetURL");
		System.out.println(URL);
	}
	
	@Test
	public void GetpetID() {
		RestAssured.baseURI = Config.prop.getProperty("BasePetURL");
		String st = Config.prop.getProperty("PetGetEndpoint")+"5";
		Response response = RestAssured.get(st);
		int code = response.statusCode();
		System.out.println(code);
		
		ResponseBody body = response.getBody();
		String b = body.asPrettyString();
		System.out.println(b);
		
		
		
		String name = response.jsonPath().get("name").toString();
		
		System.out.println(name);
		
		RestAssured.given().when().get(st).then().statusCode(300);
		
	}
}
