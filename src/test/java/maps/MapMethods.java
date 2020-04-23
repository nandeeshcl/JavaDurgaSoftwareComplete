package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapMethods {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put("Appu1", "a1");
		map.put("Appu2", "a2");
		map.put("Appu3", "a3");
		map.put("Appu4", "a4");

		System.out.println(map);

		Map map1 = new HashMap();

		map1.putAll(map); // insert all elements from map to map1

		System.out.println(map1);

		System.out.println(map.get("Appu4"));

		System.out.println(map.remove("Appu1"));

		System.out.println(map.size());

		System.out.println(map.isEmpty());

		map.clear();

		System.out.println(map.isEmpty());

		System.out.println(map);

		System.out.println(map1.containsKey("Appu1"));

		System.out.println(map1.containsValue("a4"));

		Set set = new TreeSet();

		set = map1.keySet();

		for (Object o : set) {
			System.out.println(o);
		}

		Collection c = map.values();
		for (Object i : c) {
			System.out.println(i);
		}

	}

}
