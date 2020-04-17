package rough;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {

		Map map1 = new LinkedHashMap();

		map1.put("appu1@gmail.com", "appu1");
		map1.put("appu2@gmail.com", "appu2");
		map1.put("appu3@gmail.com", "appu3");
		map1.put("appu4@gmail.com", "appu4");

		System.out.println("Map 1 is: " + map1);

		Map map2 = new LinkedHashMap();

		map2.putAll(map1);

		System.out.println("Map 2 is: " + map2);

		// remove
		System.out.println(map2.remove("appu4@gmail.com"));

		// get
		System.out.println(map2.get("appu1@gmail.com"));

		Set set = map1.keySet();

		System.out.println("Keys are");
		for (Object o : set) {
			System.out.print(o + " ");
		}

		System.out.println();

		Collection c = map1.values();

		System.out.println("Values are");
		for (Object o : c) {
			System.out.print(o + " ");
		}

		System.out.println();
		System.out.println("Size is: " + map1.size());

	}

}
