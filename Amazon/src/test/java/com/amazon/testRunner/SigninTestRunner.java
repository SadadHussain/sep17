package com.amazon.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= "Features",
		glue= "com.amazon.steps",
		tags= "@signin"
		)

public class SigninTestRunner extends AbstractTestNGCucumberTests {

}
