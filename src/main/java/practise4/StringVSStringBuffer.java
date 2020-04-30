package practise4;

public class StringVSStringBuffer {

	public static void main(String[] args) {
		
		String s1=new String("Appu");
		
		System.out.println(s1.hashCode());
		System.out.println(s1.concat("rajkumar").hashCode());
		
		StringBuffer sb=new StringBuffer("Appu");
		System.out.println(sb.hashCode());
		System.out.println(sb.append("rajkumar").hashCode());

	}

}
