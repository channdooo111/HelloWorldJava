class Calc {
	
	int num1;
	int num2;
	int result ;
	
	public Calc(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("this is me");
	}
	
	
}
public class ObjectDemo {
	
	public static void main(String[] args)

		{
			Calc obj = new Calc(4,5);
			
			System.out.println(obj.num1);
			System.out.println(obj.num2);
			
			
		
		}


}
