package arrays;

public class SIngleDimArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		System.out.println(a);  //its ref value will be printed:  [I@7852e922
		System.out.println("Size is: "+a.length);
		
		for(int x:a)
		{
			System.out.print(x+"  ");
		}
		
		System.out.println();
		
		Object o[]= {"appu",2,3.3f,66666666};
		
        System.out.println(o);  //its ref value will be printed: [Ljava.lang.Object;@4e25154f
        System.out.println("Size is: "+o.length);
		
		for(Object y:o)
		{
			System.out.print(y+"  ");
		}
		

	}

}
