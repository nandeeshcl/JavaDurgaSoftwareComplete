package day51;

public class StringVSStringBufferClass {

	public static void main(String[] args) {
		
		String s=new String("appu");
		System.out.println(s.concat("bappu").hashCode()); //resulatant data stored in different object
		System.out.println(s.hashCode());
		
		
		StringBuffer sb=new StringBuffer("appu");
		System.out.println(sb.append("bappu").hashCode()); //resulatant data stored in same  object
		System.out.println(sb.hashCode());
		

	}

}
