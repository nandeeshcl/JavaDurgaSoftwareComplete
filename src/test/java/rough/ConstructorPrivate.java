package rough;

class Sample {

	public static Sample s = null;

	private Sample() {
		
	}

	// Factory method
	static Sample getRef() {

		if (s == null) {
			s = new Sample();
			return s;
		}

		else {
			return s;
		}

	}

}

public class ConstructorPrivate {

	public static void main(String[] args) {

		Sample s1 = Sample.getRef();
		
	
		
		
		Sample s2 = Sample.getRef();
		Sample s3 = Sample.getRef();
		

		System.out.println("Hash code is:" + s1.hashCode());
		System.out.println("Ref value is:" + s1.toString());

		System.out.println("Hash code is:" + s2.hashCode());
		System.out.println("Ref value is:" + s2.toString());
		
		System.out.println("Hash code is:" + s3.hashCode());
		System.out.println("Ref value is:" + s3.toString());
		
		

		// s.m1();

	}

}
