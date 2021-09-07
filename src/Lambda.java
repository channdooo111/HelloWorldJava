
public class Lambda {

	public static void main(String[] args) {
		{
			Runnable run = () ->
			{
				for(int i= 1;i<=5;i++)
				{
					System.out.println("hi");
					try { Thread.sleep(1000); } catch (Exception e) {}
				}
				
			};
			
			Runnable run =() ->
			{
				for(int i= 1;i<=5;i++)
				{
					System.out.println("hello");
					try { Thread.sleep(1000); } catch (Exception e) {}
				}
			};
			
			Thread t1 = new Thread(obj1 );
			Thread t2 = new Thread(obj2)
		}

	}

}
