package com.utdb.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utdb.constants.FrameworkConstants;


public class Driver {
	
	private static WebDriver driver;
	
    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>() ;
    
    public static WebDriver getDriver()
	{
		return dr.get();
	}

	public static void setDriver(WebDriver driverref) {
		dr.set(driverref);
    		
	}
	
	public static void upload()
	{
		
		dr.remove();
	}
	


	public static void initDriver()
	{
		if(Objects.isNull(getDriver()))
		{
		System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromeDriverPath());
        driver = new ChromeDriver();
        
        setDriver(driver);
        
		getDriver().get("https://www.google.com/");

	}
	}
	

	public static void quitDriver()
	{
		if(Objects.nonNull(getDriver()))
		{
			getDriver().quit();
            upload();		
	}
	}
}
