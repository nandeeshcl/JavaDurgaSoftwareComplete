package reflections;

class C {
	
	int a = 22;
	float f = 22.22f;
}

public class HeapMemoryCalculation {

	public static void main(String[] args) throws ClassNotFoundException {

		/*
		 * Class c=Class.forName("reflections.C");
		 * 
		 * System.out.println(c);
		 */

		Runtime rt = Runtime.getRuntime();

		System.out.println(rt.totalMemory() - rt.freeMemory());

		C c1 = new C();
		C c2 = new C();
		C c3 = new C();

		System.out.println(rt.totalMemory() - rt.freeMemory());

	}

}
