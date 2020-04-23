package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMapVsIdentityHaspMap {

	public static void main(String[] args) {
		
        HashMap map=new HashMap();
		
		map.put("appu1@gmail.com","a123");
		map.put("appu1@gmail.com","a123");
		
		
		System.out.println(map);  
		
        IdentityHashMap map1=new IdentityHashMap();
		
		map1.put("appu1@gmail.com","a123");
		map1.put("appu1@gmail.com","a123");
		
		
		System.out.println(map1);  
		

		
	}

}
