class Superr

{
	public Superr()
	{
		System.out.println("chandu");
	}
	
	public Superr(int i)
	{
		System.out.println(" in chandu");
	}
	
class Sun extends Superr
	{
		public Sun()
		{
			super();
			System.out.println("pranavi");
		}
		
		public Sun(int i)
		{
			super();
			System.out.println(" in pranavi");
		}
	}
}
public class hello {

	public static void main(String[] args) 
	{
		
		Superr jj  = new Superr();
		Sub ss = new Sun();

	}

}

		