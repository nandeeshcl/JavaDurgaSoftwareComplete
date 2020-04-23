package com.practise.basics;

public class GetRef {

	public static void main(String[] args) {
		
		GetRefClass g=new GetRefClass();
		
		GetRefClass a1=g.getREf();
		System.out.println(a1);
		
		GetRefClass a2=g.getREf();
		System.out.println(a2);
		
		

	}

}


class GetRefClass
{
	GetRefClass getREf()
	{
		return this;
	}
}