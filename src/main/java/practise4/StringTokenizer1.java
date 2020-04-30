package practise4;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("wlecome to wipro");
		
		System.out.println("Total number of tokens are: "+st.countTokens());
		
		System.out.println(st);
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		

	}

}
