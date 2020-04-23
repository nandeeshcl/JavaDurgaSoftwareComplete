package day51;

public class MultiCatchBlock {

	public static void main(String[] args) {
		
		int a=10;
		int b;
		try
		{
			b=a/0;
		}
		catch(ArithmeticException |NullPointerException|ArrayIndexOutOfBoundsException e)
		//catch(Exception | ArithmeticException | NullPointerException e)  
		//ERROR , exception is parent and other two are child , parent child not allowed--same level allowed
		
		{
			e.printStackTrace();
		}

	}

}
