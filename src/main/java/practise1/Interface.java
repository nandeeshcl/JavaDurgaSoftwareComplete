package practise1;

interface Driver {
	int a = 10;

	void click();

	void sendKeys();
}

class FirefoxDriver implements Driver {

	int b = 20;

	@Override
	public void click() {
		System.out.println("CLick on element");

	}

	@Override
	public void sendKeys() {

		System.out.println("Send values to elements");

	}

	void m3() {
		System.out.println("m3() method");
	}

}

public class Interface {

	public static void main(String[] args) {

		Driver d = new FirefoxDriver();
		FirefoxDriver f = new FirefoxDriver();

		System.out.println("a values is: " + FirefoxDriver.a);

		f.click();
		d.sendKeys();
		f.m3();

	}

}
