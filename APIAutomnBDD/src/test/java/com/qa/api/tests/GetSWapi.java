package com.qa.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import org.testng.annotations.Test;



public class GetSWapi {
	//String url = "https://swapi.dev/api/people/.json";
	public static Properties prop;
	
	//Constructor
		public void TestBase() {
			
			try {
				prop = new Properties();
				FileInputStream fileInput = new FileInputStream("/Users/bhavani/eclipse-workspace/APIAutomnBDD/urls.properties");
				prop.load(fileInput);
			} catch (IOException e) { 
				e.getLocalizedMessage();  
			}
		}

	@Test
	public static void getSWapi() {
		String url = prop.getProperty("swapiurl");
		given().header("Content-Language", "en_US")
        .contentType("application/json")
        .when().get(url)
        .then()
		.assertThat()
		.statusCode(200).and() 
		.body("count", equalTo(82));	
	}
	
	
	@Test
	public static void getcountForHeightGreaterThan200() {	
		String url = prop.getProperty("swapiurl");
		//Passing the test data from config file for demo purposes
		String heightAbove200 = prop.getProperty("HeightAbove200");
		
		given().header("Content-Language", "en_US")
        .contentType("application/json")
        .when().get(url).then()
        .assertThat()
		.statusCode(200)
		.and()
		.body("results.findAll{ it.height > '200' }.name", equalTo(heightAbove200));

	}
}

