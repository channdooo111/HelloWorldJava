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
	
class Su extends  Superr
	{
		public Su()
		{
			System.out.println("pranavi");
		}
		
		public Su(int i)
		{
			System.out.println(" in pranavi");
		}
	}
}
public class SuperDemo {

	public static void main(String[] args) 
	{
		
		Su jj  = new Su();

	}

}
