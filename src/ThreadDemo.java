class Hi extends Thread
{
	public void run()
	{
		for(int i= 1;i<=5;i++)
		{
			System.out.println("hi");
			try { Thread.sleep(1000); } catch (Exception e) {}
		}
	}
}

class Hello extends Thread
{
	public void run()
	{
		for(int i= 1;i<=5;i++)
		{
			System.out.println("hello");
			try { Thread.sleep(1000); } catch (Exception e) {}
		}
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		
		Hi obbj1 = new Hi();
		Hello Obbj2 = new Hello();
		
		obbj1.start();
		try { Thread.sleep(10); } catch (Exception e) {}
		Obbj2.start();

	}

}
