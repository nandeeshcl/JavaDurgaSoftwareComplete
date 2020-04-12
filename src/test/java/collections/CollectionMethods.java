package collections;

import java.util.ArrayList;

public class CollectionMethods {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		ArrayList list1=new ArrayList();
		
		list1.addAll(list);
		
		System.out.println(list1);
		
		list1.remove(2);
		System.out.println(list1);
		
		list.removeAll(list1);
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.contains(2));
		
        ArrayList list2=new ArrayList();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		

		list.add(1);
		
		list.add(3);
		list.add(2);
		
         System.out.println(list2);
         System.out.println(list);
		
		System.out.println(list2.size());
		System.out.println(list.size());
		
		System.out.println(list2.containsAll(list));
		
		

	}

}
