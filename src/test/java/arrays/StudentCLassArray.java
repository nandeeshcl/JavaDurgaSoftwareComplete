package arrays;

class Student 
{
	
}
public class StudentCLassArray {

	public static void main(String[] args) {
		
		Student st[]=new Student [3];
		
		st[0]=new Student();
		st[1]=new Student();
		st[2]=new Student();
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
	}

}
