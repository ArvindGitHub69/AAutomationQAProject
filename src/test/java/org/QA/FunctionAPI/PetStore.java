package org.QA.FunctionAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.QA.Util.Config;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Request;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PetStore {

	public static String URL;
	public static String endpoint;
	
	@BeforeTest
	public void Initialization() {
		Config.init();
		URL = Config.prop.getProperty("BasePetURL");
		System.out.println(URL);
	}
	
}
