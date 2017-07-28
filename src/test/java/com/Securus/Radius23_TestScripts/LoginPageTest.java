package com.Securus.Radius23_TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Securus.Radius23_pages.HomePage;
import com.Securus.Radius23_pages.LoginPage;
import com.Securus.Radius23_pages.TestBaseSetup;
import com.Securus.Radius23_utilities.ExcelUtil;

public class LoginPageTest extends TestBaseSetup {
	
	@Test
	public void verifyLogin()
	{
		
		HomePage home=new HomePage(driver);
		 home.loginLink().click();
		(new WebDriverWait(driver, 80)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='userName']")));
		//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("test");
		LoginPage login = new LoginPage(driver);
		
		
        login.loginToApplication("vt.madhavi@gmail.com", "chandu123");
	}
	
	

}
