package day51;

import java.util.StringTokenizer;

public class StringToeknization {

	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("Appu Shivu Raghu");
		
		System.out.println("Total number of tokens are: "+st.countTokens());
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
