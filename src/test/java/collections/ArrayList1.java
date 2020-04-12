package collections;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(null);
		
		System.out.println(list);
		
		ArrayList list1=new ArrayList(list);
		System.out.println(list1);
		
		Stack s=new Stack();
		s.add(2);
		
		System.out.println(s);
	}

}
