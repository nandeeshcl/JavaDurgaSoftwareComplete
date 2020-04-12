package maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapClass {

	public static void main(String[] args) {
		
		TreeMap map=new TreeMap();
		
		map.put(1, "aaa");
		map.put(3,"ccc");
		map.put(2,"bbb");

		System.out.println(map);  //ascending order
		
		System.out.println(map.descendingMap());   //descending order
	}

}
