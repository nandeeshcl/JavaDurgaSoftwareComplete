package arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int a[][]= {  {1,2} , {3,4}  };
		
		System.out.println("Row size: "+a.length);
		System.out.println("Col size: "+a[0].length);
		System.out.println();

		//refrence values
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println();
		
		System.out.println("Array elements are: ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		System.out.println("Array elemetns are:");
		
		for(int x[]:a)
		{
			for(int i:x)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
