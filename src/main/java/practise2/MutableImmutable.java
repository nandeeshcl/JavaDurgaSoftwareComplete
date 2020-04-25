package practise2;

public class MutableImmutable {

	public static void main(String[] args) {

		String s1 = new String("Appu");
		System.out.println(s1.hashCode());
		System.out.println(s1.concat(" Rajkumar").hashCode()); // new hash code since new obj created

		StringBuffer sb = new StringBuffer("Appu");
		System.out.println(sb.hashCode());
		System.out.println(sb.append(" Rajkumar").hashCode()); // same hash code since same obj content is modified

	}

}
