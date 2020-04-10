package com.practise.basics;

public class FirstApp {

	public static void main(String[] args) {

		System.out.println("Hello World");

		Sample.main2();

	}

}

class Sample {
	public static void main2() {

		System.out.println("Hello world 2");
		
		

	}
}


//ERROR: cannot contain more than one public/private/protected class in single java file
/*public class Test
{
	
}

private class Test
{
	
}

protected class Test
{
	
}*/