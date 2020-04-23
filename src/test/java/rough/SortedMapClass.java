package rough;

import java.util.NavigableMap;
import java.util.TreeMap;

public class SortedMapClass {

	public static void main(String[] args) {
		
		NavigableMap map1=new TreeMap();
		
		map1.put("appu1",1);
		map1.put("appu2",2);
		map1.put("appu2",3);
		
		System.out.println(map1);
		
		System.out.println(map1.higherKey("appu1"));
		
		System.out.println(map1.higherEntry("appu1"));
		
		
		

	}

}
