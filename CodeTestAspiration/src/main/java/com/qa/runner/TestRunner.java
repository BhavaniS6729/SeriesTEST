package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/bhavani/eclipse-workspace/CodeTestAspiration"
				+ "/src/main/java/FeatureFile",
		glue={"com/qa/stepDefs"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //reports
		monochrome = true, //console output in pretty fromat
		strict = true, //checking step def file for invalid or unpresent steps
		dryRun = false
)


public class TestRunner {   

}


