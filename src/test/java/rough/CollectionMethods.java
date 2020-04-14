package rough;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

	public static void main(String[] args) {
		
		Collection c=new ArrayList();
		
		c.add(10);
		c.add("appu");
		c.add(22.33f);
		c.add('c');
		
		System.out.println(c);
		
		Collection c1=new ArrayList();
		
		c1.addAll(c);
		c1.add(3);
		System.out.println(c1);
		
		Object o[]=c1.toArray();
		
		for(Object i:o)
		{
			System.out.println(i);
		}
		
		System.out.println(c1.isEmpty());
		c1.clear();
		System.out.println(c1.isEmpty());
		
		c.retainAll(c1);
		
		System.out.println(c);

	}

}
