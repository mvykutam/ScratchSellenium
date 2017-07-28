package com.Securus.Radius23_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	
	public HomePage(WebDriver driver) {
		super.driver=driver;
	}
	
	
	
	public WebElement loginLink()
	{
		return Element("xpath", "//a[@ng-click='login()']");
	}
	public WebElement signUpLink()
	{
		return Element("xpath", "//a[@href='#/signup']");
		
	}
	
	
	
//	
	@FindBy(xpath="//a[@ng-click='login()']")
	public WebElement LoginHeader;
//
//	@FindBy(xpath="//a[@href='#/signup']")
//	public WebElement SignUpHeader;
//
//	@FindBy(xpath="//input[@name='userName']")
//	WebElement LoginEmailId;
//
//	@FindBy(xpath="//input[@name='password']")
//	WebElement LoginPassword;
//
//	@FindBy(xpath="//button[@ng-click='login()']")
//	WebElement Loginbutton;
//	
//	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
//	WebElement ForgotPassword_link;
//	
//	@FindBy(xpath="//input[@ng-model='ResetPassword.UserName']")
//	WebElement EnterEmail_ResetPassword_link;
//	
//	@FindBy(xpath="///button[@ng-click='sendOTP()']")
//	WebElement Send_OTP_ForResetPassword_link;
	
	
	@FindBy(xpath="//a[@class='dropdown-toggle pull-right link']")
	WebElement LoginSuccess_LandingPageIcon;
	
	
	
	

//	public void loginToApplication(String emailAddress, String password) {
//		LoginHeader.click();
//		LoginEmailId.sendKeys(emailAddress);
//		LoginPassword.sendKeys(password);
//		Loginbutton.click();
//	}
}