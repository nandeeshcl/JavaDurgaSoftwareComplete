package GarbageCollection;


class Garbage
{
	void m1()
	{
		System.out.println("m1 method");
	}
}
public class ObjectDestroying {

	public static void main(String[] args) {

         Garbage g=new Garbage();
         
         g=null;
         
         System.gc();
         
         g.m1();
         
         //System.out.println(g.hashCode());

	}

}
