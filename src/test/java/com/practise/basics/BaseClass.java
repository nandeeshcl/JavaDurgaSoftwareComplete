package com.practise.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	/*private  BaseClass()
	{
		
	}
	*/
	   public static  WebDriver driver=null;
	   
	   
	
		static WebDriver getDriver()
		{
			if(driver==null)
			{
				System.setProperty("webdriver.chrome.driver",".\\src\\test\\Driver1\\chromedriver.exe");
				driver =new ChromeDriver();
				//return driver;
			}
			
		/*	else
			{
				return driver;
			}*/
			
			return driver;
			
		}
		
		
		
	

}
