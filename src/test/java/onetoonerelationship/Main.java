package onetoonerelationship;

public class Main {

	public static void main(String[] args) {
		
		Account ac=new Account();
		ac.setaNum(100);
		ac.setType("Saving");
		
		
		Employee e=new Employee();
		e.setEname("Appu");
		e.setEid(122);
		
		Employee e1=new Employee();
		e1.setEname("BAppu");
		e1.setEid(222);
		
		
		System.out.println("Account details are: ");
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(ac.getaNum());
		System.out.println(ac.getType());
		//System.out.println(e.getClass());
		
		
		

	}

}
