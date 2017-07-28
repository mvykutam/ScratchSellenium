package com.Securus.Radius23_pages;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Securus.Radius23_utilities.PropertyUtil;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseSetup {
	
	public WebDriver driver=null;
	final public Logger log = Logger.getLogger(Log.class.getName());
	
	
	private void setDriver(String browserType,String appURL)
	{
		log.info("setting the browser");
		System.out.println("setting the browser");
		ChromeDriverManager.getInstance().setup();
		FirefoxDriverManager.getInstance().setup();
		OperaDriverManager.getInstance().setup();
		PhantomJsDriverManager.getInstance().setup();
		EdgeDriverManager.getInstance().setup();
		InternetExplorerDriverManager.getInstance().setup();
		log.info("Browser Type:"+browserType);
		driver=initChromeDriver(appURL);
		
		if(browserType.equalsIgnoreCase("chrome"))
		{
			System.out.println("Initilizition chrome browser");
			driver=initChromeDriver(appURL);
		}
		else if(browserType.equalsIgnoreCase("firefox"))
		{
			System.out.println("Initilizition firefox browser");
			driver=initChromeDriver(appURL);
		}
		else if(browserType.equals("ie"))
		{
			System.out.println("Initilizition ie browser");
			driver=initIEDriver(appURL);
		}
	}
	
	private static WebDriver initChromeDriver(String appURL)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
	}
	
	private static WebDriver initFirefoxDriver(String appURL)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
	}
	
	private static WebDriver initIEDriver(String appURL)
	{
			WebDriver driver =new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.get(appURL);
				return driver;
	}
		

	@BeforeClass
	public void initializeTestBaseSetup()
	{
		System.out.println("in before class for initializing browser");
		System.out.println("browser:"+PropertyUtil.getValuforKey("browser"));
		System.out.println("url:"+PropertyUtil.getValuforKey("url"));
		
		setDriver(PropertyUtil.getValuforKey("browser"), PropertyUtil.getValuforKey("url"));
	}
	
	
	
	
}


