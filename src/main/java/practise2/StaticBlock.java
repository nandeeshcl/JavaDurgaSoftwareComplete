package practise2;

class Static {
	int a = 10;
	static int b = 22;
	static {
		int p = 11;
		// static int q=12; //Local var cannot be static
		System.out.println("static block");
		// System.out.println(a); //instance member not allow ---to acess create ref var
		// and call
		Static s = new Static();
		System.out.println(s.a); // call instance using ref var

		System.out.println(b);
	}
}

public class StaticBlock {

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("practise2.Static"); // load byte code to mem and static context will be executed

	}

}
