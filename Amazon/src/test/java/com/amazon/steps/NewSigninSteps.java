package com.amazon.steps;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazon.common.SigninCommon;
import com.amazon.pages.SigninPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewSigninSteps extends SigninCommon {
	SigninPages PF;

	@Given("^go to home page$")
	public void go_to_home_page()  {
		getdriver();
		PF= PageFactory.initElements(driver, SigninPages.class);
	   
	   
	}

	@When("^Click on hello signin$")
	public void click_on_hello_signin() {
	   PF.getHello().click();
	   
	}

	@When("^enter valid user name$")
	public void enter_valid_user_name()  {
		PF.getEmail().sendKeys("sadad_sz@yahoo.com");
		PF.getSubmit().click();
	   
	   
	}

	@When("^enter valid password$")
	public void enter_valid_password()  {
		PF.getPassword().sendKeys("Dhaka2016");
		
	   
	   
	}

	@When("^click on submit vutton$")
	public void click_on_submit_vutton()  {
		PF.getSignin().click();
	   
	   
	}

	@Then("^user profile should be appeared$")
	public void user_profile_should_be_appeared()  {
	   Assert.assertEquals(driver. getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	   
	}


}
