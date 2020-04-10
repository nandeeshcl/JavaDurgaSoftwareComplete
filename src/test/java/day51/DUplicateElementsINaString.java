package day51;

import java.util.HashSet;
import java.util.Set;

public class DUplicateElementsINaString {

	public static void main(String[] args) {
		
/*Set<Integer> set=new HashSet<Integer>();
		
		String s=new String("Appu");
		
		byte b[]=s.getBytes();
	
	    for(byte i:b)
	    {
	    	if(set.add((int) i))
	    	{
	    		System.out.println("added");
	    	}
	    	else
	    	{
	    		System.out.println("Duplicate found:"+i);
	    		break;
	    	}
	    }*/
		
		
        Set<Character> set=new HashSet<Character>();
		
		String s=new String("Appu");
		
		char c[]=s.toCharArray();
	
	    for(char i:c)
	    {
	    	if(set.add(i))
	    	{
	    		System.out.println("added");
	    	}
	    	else
	    	{
	    		System.out.println("Duplicate found:"+i);
	    		break;
	    	}
	    }
		
		

	}

}
