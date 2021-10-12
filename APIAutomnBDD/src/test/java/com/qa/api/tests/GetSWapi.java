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

import java.util.List;

import org.testng.annotations.Test;


public class GetSWapi {
	
	String url = "https://swapi.dev/api/people/.json";

	@Test
	public void getSWapi() {
		
		given().header("Content-Language", "en_US")
        .contentType("application/json")
        .when().get(url)
        .then()
		.assertThat()
		.statusCode(200).and()
		.body("count", equalTo(82));	
	}
	
	
	@Test
	public void getcountForHeightGreaterThan200() {		
		String HeightAbove200 = "[R2-D2, Darth Vader, R5-D4]";
		
		given().header("Content-Language", "en_US")
        .contentType("application/json")
        .when().get(url).then()
        .assertThat()
		.statusCode(200)
		.and()
		.body("results.findAll{ it.height > '200' }.name", equalTo(HeightAbove200));

	}
}
