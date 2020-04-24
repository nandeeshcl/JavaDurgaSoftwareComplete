package practise1;

abstract class Selenium {
	int a = 10;

	void m1() {
		System.out.println("m1() method");
	}

	abstract void click();

	abstract void sendKeys();
}

class ChromeDriver extends Selenium {

	int b = 20;

	@Override
	void click() {
		System.out.println("CLick on element");

	}

	@Override
	void sendKeys() {

		System.out.println("Send values to elements");

	}

	void m3() {
		System.out.println("m3() method");
	}

}

public class AbstractClass {

	public static void main(String[] args) {

		Selenium s = new ChromeDriver();

		ChromeDriver c = new ChromeDriver();

		System.out.println("Value of a is: " + s.a);
		s.m1();
		s.click();
		s.sendKeys();

		System.out.println("Value of b is " + c.b);
		c.m3();
		c.sendKeys();

		System.out.println("Class of s refrence var is: " + s.getClass());
		System.out.println("Class of s refrence var is: " + c.getClass());

	}

}
