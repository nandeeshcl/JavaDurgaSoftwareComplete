package practise1;

public class VarAndConstExpInIF {

	public static void main(String[] args) {
		
		//constatnt exp: final/literal/boolean--evaluated by compiler
		
		//case 1: no error
		/*int a=10;
		int b;
		if(10==10) {
			b=20;
		}
	    System.out.println(b);*/
	    
	    //Case 2: error
	   /* int a=10;
		int b;
		if(11==10) {
			b=20;
		}
	    System.out.println(b);*/
	    
	    //variable exp: atleast one var: evaluated by jvm
		//Case 1: error
		    int a=10;
			int b;
			int i=22;
			if(i==10) {
				b=20;
			}
		    System.out.println(b);


	}

}
