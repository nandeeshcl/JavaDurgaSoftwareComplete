package com.practise.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 {

	public static WebDriver driver ;

	static {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	
/*	static WebDriver getDriver() {

		return driver;

	}*/

}
