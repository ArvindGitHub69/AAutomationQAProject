package org.QA.TestNG.Test_API;

import java.util.HashMap;
import java.util.Map;

import org.QA.FunctionAPI.PetAPI_Request;
import org.QA.Util.Config;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TC1API {

	@Test
	public void GetpetID() {
		RestAssured.baseURI = Config.prop.getProperty("BasePetURL");
		String st = Config.prop.getProperty("PetGetEndpoint") + "5";
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

	@Test
	public void getPetName() {
		RestAssured.baseURI = Config.prop.getProperty("BasePetURL");
		String st = Config.prop.getProperty("PetGetEndpoint") + "5";

		RequestSpecification ReqSpec = RestAssured.given();

		Response response = ReqSpec.request(Method.GET, st);

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());
	}

	@Test
	public void postPetName() {
		RestAssured.baseURI = Config.prop.getProperty("BasePetURL");
		String st = Config.prop.getProperty("PetPostEndpoint");

		Map<Object, Object> mp = new HashMap<Object, Object>();
		Map<Object, Object> cat = new HashMap<Object, Object>();
		Map<Object, Object> tag = new HashMap<Object, Object>();

		cat.put("id", "0");
		cat.put("name", "String");
		tag.put("id", "0");
		tag.put("name", "String");

		mp.put("id", "0");
		mp.put("category", cat);
		mp.put("name", "doggie");
		mp.put("photoUrls", "string");
		mp.put("tags", tag);
		mp.put("status", "available");

		RestAssured.given().header("Content-Type", "application/json").body(mp).log().all().when().post(st).then().log()
				.all();
			}

	@Test
	public void ObjectmappedPostPetName() throws JsonProcessingException {

		//RestAssured.baseURI = Config.prop.getProperty("BasePetURL");
		//String st = Config.prop.getProperty("PetPostEndpoint");

		PetAPI_Request re = new PetAPI_Request();
		
		ObjectMapper mapper = new ObjectMapper();
		String ss = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(re);
		System.out.println(ss);
	}
}
