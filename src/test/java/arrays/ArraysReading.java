package arrays;

import java.util.Arrays;

public class ArraysReading {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		
		//System.out.println(Arrays.toString(a));
		
		/*for(datatype varname : arayrefvarname)
		{
			System.out.println(varname);
		}*/
			
		/*for(int i : a)
		{
			System.out.println(i);
		}*/
		
		
		
		int b[][]= {  {1,2}   , {3,4}  ,{4,5}  };  
		
		/*for(int    i[] :b)
		{
			for(int x: i)
			{
				System.out.println(x);
			}
		}*/
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(Arrays.toString(b[i]));
		}
		
			
		
	}

}
