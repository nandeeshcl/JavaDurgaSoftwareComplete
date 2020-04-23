package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import p2.E;

class Student1 {

}

public class Iterators {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(22);
		v.add(33.33);
		v.add(new Student1());
		v.add(new String("Appu"));

		System.out.println("--------Vector FOR EACH----------------");
		for (Object o : v) {
			System.out.println(o);
		}

		System.out.println("--------Vector ENUMERATION----------");
		Enumeration<E> e = v.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		ArrayList list = new ArrayList(v);
		
		System.out.println("----------Array List FOR EACH--------------");
		for (Object o : v) {
			System.out.println(o);
		}

		System.out.println("----------Array List ITERATOR--------------");

		Iterator<E> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("----------Array List LIST ITERATOR FORWARD--------------");
		ListIterator lt=list.listIterator();
		
		//FORWARD
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		System.out.println("----------Array List LIST ITERATOR BACKWORD--------------");
		//BACKWORD
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}

	}

}
