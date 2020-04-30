package practise4;

public class TryCatchFinally {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		int div;

		try {
			div = a / b;
		}

		catch (NullPointerException | ArithmeticException e) {
			// System.out.println(e);
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally");
		}

		System.out.println("ENds");

	}

}
