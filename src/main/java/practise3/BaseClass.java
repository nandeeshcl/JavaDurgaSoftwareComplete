package practise3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver = null;

	static {

		driver = DriverClass.getRef();
	}

}
