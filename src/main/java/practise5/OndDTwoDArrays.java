package practise5;

import java.util.Arrays;

class Ana {
	public static void print(int a[]) {
		for (int i : a) {
			System.out.print(i + " ");
		}

		System.out.println();

	}
}

public class OndDTwoDArrays {

	public static void main(String[] args) {

		Ana.print(new int[] { 1, 2, 3 });

		int a[] = { 1, 2, 3, 4 };

		String str[] = new String[2];

		str[0] = "appu";
		str[1] = "raghu";

		for (String s : str) {
			System.out.println(s);
		}

		for (int i : a) {
			System.out.println(i);
		}

		System.out.println(a);
		System.out.println(str);
		System.out.println(Arrays.toString(str));

		int b[][] = new int[2][2];

		b[0][0] = 10;
		b[0][1] = 20;

		b[1][0] = 30;
		b[1][1] = 40;

		System.out.println(b);
		System.out.println(b[0]);

		for (int[] j : b) {
			for (int x : j) {
				System.out.println(x);
			}
		}

	}

}
