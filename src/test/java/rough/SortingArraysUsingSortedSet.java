package rough;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SortingArraysUsingSortedSet {

	public static void main(String[] args) {
		
		int a[]= {2,1,5,4,3};
		
		NavigableSet set=new TreeSet();
		
		for(int i:a)
		{
			set.add(i);
		}
		
		System.out.println("Ascending order sorted array is: "+set);

		System.out.println("Descending order sorted array is: "+set.descendingSet());
	}

}
