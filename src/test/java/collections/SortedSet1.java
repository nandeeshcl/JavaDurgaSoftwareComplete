package collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import p2.E;

public class SortedSet1 {

	public static void main(String[] args) {

		SortedSet<Integer> s = new TreeSet<Integer>();

		s.add(20);
		s.add(10);
		s.add(30);
		s.add(50);
		s.add(11);

		System.out.println(s);

		System.out.println(s.headSet(11));

		System.out.println(s.tailSet(11));

		System.out.println(s.first());

		System.out.println(s.last());

		System.out.println(s.subSet(11, 30));

		for (Integer i : s) {
			System.out.println(i);
		}

		System.out.println("**************");
		Iterator<Integer> it = s.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
