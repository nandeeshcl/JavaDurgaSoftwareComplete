package day51;

import java.util.HashSet;
import java.util.Set;

public class StringManipulationFunctions {

	public static void main(String[] args) {
		
		String str="Ap  pu";
		
		System.out.println(str.replace('A','b'));
		
		System.out.println(str.indexOf("q"));
		
        //remove spaces in string
		System.out.println(str.replace(" ",""));


		StringBuffer sb=new StringBuffer(str);
		System.out.println("Reverse is: "+sb.reverse());
	}

}
