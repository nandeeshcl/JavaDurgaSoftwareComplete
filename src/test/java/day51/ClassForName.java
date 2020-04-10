package day51;


class PP
{
	static 
	{
		System.out.println("Hai");
	}
}
public class ClassForName {

	public static void main(String[] args) throws ClassNotFoundException {

         Class.forName("day51.PP");  //provide FQN, if this class not exist we get class cast exception
         
	}

}
