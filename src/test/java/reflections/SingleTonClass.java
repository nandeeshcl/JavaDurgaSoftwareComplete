package reflections;


class Single
{
	public static Single single=new Single();
	
	private Single() {}
	
	public static Single getSingle()
	{
		return single;
	}
	
}


public class SingleTonClass {

	public static void main(String[] args) {
		
		Single s1=Single.getSingle();
		Single s2=Single.getSingle();
		Single s3=Single.getSingle();
		
		System.out.println(s1);
		System.out.println(s1);
		System.out.println(s1);
		
	}

}
