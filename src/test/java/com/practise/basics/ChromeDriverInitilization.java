package com.practise.basics;


public class ChromeDriverInitilization extends BaseClass{

	public static void main(String[] args) {
		
		System.out.println(getDriver());
		System.out.println(getDriver());
		System.out.println(getDriver());
		
		/*driver.get("https://www.google.com");
		driver.get("https://www.google.com");
		driver.get("https://www.google.com");*/
		
		
		driver.quit();

	}

}
