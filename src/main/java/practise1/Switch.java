package practise1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input values: a and b ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;

		System.out.println("Enter operator: ");
		String op = sc.next();

		switch (op) {
		case "+": {
			result = a + b;
			break;
		}

		case "-": {
			result = a - b;
			break;
		}

		case "*": {
			result = a * b;
			break;
		}

		default:
			System.out.println("Invalid operator");

		}

		System.out.println("Result is: " + result);

	}

}
