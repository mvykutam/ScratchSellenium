package com.Securus.Radius23_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupRegisterPage extends BasePage{

	
	public SignupRegisterPage(WebDriver driver)
	{
		super.driver=driver;
	}
	
	
	public WebElement signupFirstName()
	{
		return Element("xpath", "//input[@name='firstName' or @ng-model='Register.FirstName']");
	}
	
	public WebElement signupLastName()
	{
		return Element("xpath", "//input[@name='firstName' or @ng-model='Register.FirstName']");	
	}
	
	public WebElement signupPublicVisibleName()
	{
		return Element("xpath", "//input[@ng-model='Register.DisplayName' or @placeholder='Publicly Visible Name']");	
	}
	
	public WebElement signupEmailAddress()
	{
		return Element("xpath", "//input[@name='userName'][@placeholder='Email Address']");	
	}
	
	public WebElement signupPassword()
	{
		return Element("xpath", "//input[@name='password' or @ng-model='Register.Password']");	
	}
	
	public WebElement signupPhoneNumber1Cell()
	{
		return Element("xpath", "//input[@name='phone1' or @ng-model='Register.Phone1']");	
	}
	
	public WebElement signupPhoneNumber2Home()
	{
		return Element("xpath", "//input[@name='phone2' or @ng-model='Register.Phone2']");	
	}
	
	public WebElement signupAddress1()
	{
		return Element("xpath", "//input[@name='address1' or @ng-model='Register.Address1']");	
	}
	
	public WebElement signupAddress2()
	{
		return Element("xpath", "//input[@placeholder='Address 2' or @ng-model='Register.Address2']");	
	}
	
	public WebElement signupCountry()
	{
		return Element("xpath", "//input[@name='country'][@ng-model='Register.Country'][1]");	
	}
	
	public WebElement signupState()
	{
		return Element("xpath", "//input[@name='state' or @ng-model='Register.State']");	
	}
	
	public WebElement signupCity()
	{
		return Element("xpath", "//input[name='city' or @ng-model='Register.City']");	
	}
	
	public WebElement signupZipcode()
	{
		return Element("xpath", "//input[@name='zipcode'][@required='required']");	
	}
	
	public WebElement signupAccountCreateButton()
	{
		return Element("xpath", "//button[@class='btn btn-primary' or @ng-click='registerClick()']");	
	}
	
	public String firstName;
	public String lastName;
	public String publicVisibleName;
	public String emailAdress;
	public String password;
	public String PhoneNumber1Cell;
	public String phoneNumber2Home;
	public String address1;
	public String address2;
	public String country;
	public String state;
	public String city;
	public String zipCode;
	
	public void  signupRadious23Account()
	{
		signupFirstName().sendKeys(firstName);
		signupLastName().sendKeys(lastName);
		signupPublicVisibleName().sendKeys(publicVisibleName);
		signupEmailAddress().sendKeys(emailAdress);
		signupPassword().sendKeys(password);
		signupPhoneNumber1Cell().sendKeys(PhoneNumber1Cell);
		signupPhoneNumber2Home().sendKeys(phoneNumber2Home);
		signupAddress1().sendKeys(address1);
		signupAddress2().sendKeys(address2);
		signupCountry().sendKeys(country);
		signupState().sendKeys(state);
		signupCity().sendKeys(city);
		signupZipcode().sendKeys(zipCode);
		signupAccountCreateButton().click();
	}
	
}
	
	
	
	
	