package practise4;

class P {
	public void m1() {
		System.out.println("m1()");
	}
}

class Q extends P {
	public void m2() {
		System.out.println("m2()");
	}
}

public class ClassLevelUpcastingDowncasting {

	public static void main(String[] args) {

		// Q q1=new P(); //error need downcasting

		P p = new Q(); // create obj for child class and store its vaue in parent ref var
		Q q = (Q) p; // assign parent ref value var to child class ref var

		p.m1();
		// p.m2(); no acess

		q.m1();
		q.m2();

	}

}
