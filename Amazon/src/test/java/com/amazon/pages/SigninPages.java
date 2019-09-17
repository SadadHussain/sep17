package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPages {
	WebDriver driver;
	public SigninPages (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	private WebElement Hello;
	public WebElement getHello() {
		return Hello;
	}
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath="//input[@id='continue']")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//input[@id='id=\"ap_password\"']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	public WebElement getSignin() {
		return signin;
	}
	
	

	
	
}
