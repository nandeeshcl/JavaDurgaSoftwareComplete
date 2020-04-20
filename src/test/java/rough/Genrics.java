package rough;

import java.util.ArrayList;
import java.util.List;

public class Genrics {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		int a = 10;

		list.add("Appu");
		list.add("Shivu");

		// type of variable
		System.out.println(list.getClass().getName());

		for (String s : list) {
			System.out.println(s);
		}

	}

}
