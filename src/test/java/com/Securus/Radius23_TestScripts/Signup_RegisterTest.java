package com.Securus.Radius23_TestScripts;

import org.testng.annotations.Test;

import com.Securus.Radius23_pages.HomePage;
import com.Securus.Radius23_pages.SignupRegisterPage;
import com.Securus.Radius23_pages.TestBaseSetup;

public class Signup_RegisterTest extends TestBaseSetup{
	SignupRegisterPage signup =new SignupRegisterPage(driver);
	
	
	
	
	@Test
	public void verifySignupRegistration()
	{
		HomePage hp = new HomePage(driver);
		hp.signUpLink().click();
				
		signup.signupRadious23Account();

		
	}
	
	
	
	
	
	

}
