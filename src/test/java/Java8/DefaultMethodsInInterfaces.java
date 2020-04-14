package Java8;

interface J {
	default void m() {
		System.out.println("m1 methods");
	}
}

class C implements J {
	public void m() {
		System.out.println("Overrided");
	}
}

class D implements J {

}

public class DefaultMethodsInInterfaces {

	public static void main(String[] args) {
		
		C c=new C();
		D d=new D();
		c.m();
		d.m();
		
	    J j=new C();
	    j.m();
	    
	    J j1=new D();
	    j1.m();

	}

}
