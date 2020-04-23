package practise1;

public class TypeCasting {

	public static void main(String[] args) {

		// implicit
		int i = 10;

		long l = i;
		System.out.println(l + "  " + i);

		// explicit
		long a = 1233333354;

		int b = (int) a;
		System.out.println(a + "  " + b);
		
		char c='A';
		byte j=(byte) c;
		
		System.out.println(j);
		
	
		
	}

}
