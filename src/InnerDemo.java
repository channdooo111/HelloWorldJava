/*
 * inner class
 * outer class
 * member class
 * Anonymous class
 * for calling inner class in main method used outer class name for reference and use outer obj for constructor
 * we can make staic class


*/

class Outer 
{
	int a;
	public void show()
	{
	System.out.println("show");	
	}
	class Inner
	{
		public void dispay()
		{
		System.out.println(" Display");
	}
}
}
public class InnerDemo {

	public static void main(String[] args) {
		
		Outer obj = new Outer();
		
		Outer.Inner obj1 = obj.new Inner();
		
		obj.show();
		obj1.dispay(); 

	}

}
