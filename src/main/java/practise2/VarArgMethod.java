package practise2;

class Var {
	void sum(int... a) {
		int sum = 0;
		for (int i : a) {
			sum = sum + i;
		}

		System.out.println("Sum is: " + sum);

	}
}

public class VarArgMethod {

	public static void main(String[] args) {

		Var v = new Var();

		v.sum(10, 20, 30);

	}

}
