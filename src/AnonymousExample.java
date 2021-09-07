// Types of interface
// 1. Normal
// 2. Single abstract method - functional interface - lamba interface 
// 3. Marker Interface


class Ann
{
	public void show()
	{
		System.out.println("sfdds");
	}
}
public class AnonymousExample {

	public static void main(String[] args) {
		
		Ann an = new Ann()
		         {
			           public void show()
			             {
				
				         System.out.println("zxccv");
			}
		};
		an.show();

	}

}
