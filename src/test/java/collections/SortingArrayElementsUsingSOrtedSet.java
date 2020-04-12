package collections;

import java.util.Set;
import java.util.TreeSet;

public class SortingArrayElementsUsingSOrtedSet {

	public static void main(String[] args) {

		int a[] = { 2, 3, 1, 4, 5 };

		TreeSet<Integer> s = new TreeSet();

		for (int i : a) {
			s.add(i);
		}

		// ascending order
		
		System.out.println(s);
		
		//to print in descending order
		
		System.out.println(s.descendingSet());

	}

}
