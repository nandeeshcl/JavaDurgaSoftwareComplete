package collections;

import java.util.ArrayList;

public class ToCheck2ArrayEquals {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b[]= {1,2,3,4};
		
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		
		for(int i:a)
		{
			list1.add(i);
		}
		System.out.println(list1);
		
		for(int j:b)
		{
			list2.add(j);
		}
		System.out.println(list2);
		
		System.out.println(list1.retainAll(list2));
		
		//compare
		if(list1.retainAll(list2))
		{
			System.out.println("Not same");
		}
		
		else
		{
			System.out.println("Both are same");
		}

	}

}
