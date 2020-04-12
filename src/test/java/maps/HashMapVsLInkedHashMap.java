package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapVsLInkedHashMap {

	public static void main(String[] args) {
		
		System.out.println("---HASH MAP--INSERTION ORDER---");
		
		HashMap map=new HashMap();
		
		map.put("appu1@gmail.com","a123");
		map.put("appu2@gmail.com","a234");
		map.put("appu3@gmail.com","a345");
		
		System.out.println(map);  //npo insertion order
		
		System.out.println("---LINKED HASH MAP--INSERTION ORDER---");
		

		LinkedHashMap map1=new LinkedHashMap();
		
		map1.put("appu1@gmail.com","a123");
		map1.put("appu2@gmail.com","a234");
		map1.put("appu3@gmail.com","a345");
		
		System.out.println(map1);  //insertion order

	}

}
