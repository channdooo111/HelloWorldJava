// Abstract class -> Define and declare
// Interface -> declare -> 1.7
// java 1.8 can define methods in interface

interface Demo
{
	void abc();// method declaration
	default void show() // method defination
	{
		System.out.println("in show");
	}
}

abstract  class DemoImp implements Demo
{
{
	System.out.println("in abc");
}
}
public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo oj = new DemoImp();
		oj.abc();
		oj.show();

	}

}
