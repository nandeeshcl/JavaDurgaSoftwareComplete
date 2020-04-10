package inheritence;

class P
{
	P(int a)
	{
		
	}
}

class Q extends P
{
	Q(){
		super(11);
		
	}
}

class R extends Q
{
	R()
	{
		
	}
}
public class ZeroArgCOntConflict {

	public static void main(String[] args) {
		
		R c=new R();
		

	}

}
