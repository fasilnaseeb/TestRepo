package com.crm.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoconstant {
	
		
	
	
	
	public static WebDriver driver;
	
	
	
	@BeforeClass
	public void openBrowser() {
		
		
		
		System.setProperty(CHROME_KEY, CHOROME_VALUE);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		
	
	
	
	
	
	}
}
