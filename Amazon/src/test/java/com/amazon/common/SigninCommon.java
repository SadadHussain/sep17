package com.amazon.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninCommon {
	public WebDriver driver;
	public WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

}
