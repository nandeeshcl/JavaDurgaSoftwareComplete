package practise3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {

	public static WebDriver driver = null;

	private DriverClass() {

	}

	static {
		System.setProperty("webdriver.chrome.driver", "D:\\JM Videos\\Practise_Codes\\Drivers\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	static WebDriver getRef() {
		return driver;
	}
}
