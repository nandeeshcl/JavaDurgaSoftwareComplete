package com.practise.basics;

import org.omg.Messaging.SyncScopeHelper;

public class MutableAndImmutable {

	public static void main(String[] args) {
		
		String s1=new String ("Appu");
		String s2= s1.concat("Raj");
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuffer sb=new StringBuffer("Appu");
		
		StringBuffer sb2=sb.append("Raj");
		
		System.out.println(sb);
		System.out.println(sb2);
		

	}

}
