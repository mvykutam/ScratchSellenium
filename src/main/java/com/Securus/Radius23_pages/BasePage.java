package com.Securus.Radius23_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Securus.Radius23_utilities.PropertyUtil;

public class BasePage {

	WebDriver driver=null;
	public WebElement Element(String locatorType,String locator)///driver, "xpath', "//input[contains(text()='abc')]"
	{
		waitForElement(locatorType,locator);
		return driver.findElement(elementByLocator(locatorType,locator));
	}
	
		
	public By elementByLocator(String locatorType,String locator)
	{
		By by=null;
		if(locatorType.equals("xpath"))
		{
			System.out.println("In xpath locator");
			by=By.xpath(locator);
		}
		else if(locatorType.equals("cssSelector"))
		{
			by=By.cssSelector(locator);
		}
		else if(locatorType.equals("id"))
		{
			by=By.id(locator);
		}
		else if(locatorType.equals("name"))
		{
			by=By.name(locator);
		}
		else if(locatorType.equals("className"))
		{
			by=By.className(locator);
		}
		else if(locatorType.equals("linkText"))
		{
			by=By.linkText(locator);
		}
		else if(locatorType.equals("partialLinkText"))
		{
			by=By.partialLinkText(locator);
		}
		else if(locatorType.equals("tagName"))
		{
			by=By.tagName(locator);
		}
		return by;
	}
	
	public void selectOptionFromDropdown()
	{
		
	}
	public String getTitle()
	{
		return driver.getTitle();
	}
	public String getCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void waitForElement(String locatorType,String locator)
	{
		int waitTime=Integer.parseInt(PropertyUtil.getValuforKey("maxElementwaitTimeInSeconds"));
		(new WebDriverWait(driver, waitTime)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementByLocator(locatorType,locator)));
	}
	public void waitForElement(String locatorType,String locator,int waitTime)
	{
		(new WebDriverWait(driver, waitTime)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementByLocator(locatorType,locator)));
	}
	public void waitForElement(WebElement element,int waitTime)
	{
		(new WebDriverWait(driver, waitTime)).until(ExpectedConditions.visibilityOf(element));
	}
}
