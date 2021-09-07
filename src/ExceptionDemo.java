
public class ExceptionDemo {

	public static void main(String[] args) {
		{
			try
			{
				int a[] = new int[5];
				int i = 7;
				int  j = 0;
				int k = i/j;
				System.out.println("output is " + k);
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
			{
				System.out.println("error");
			}
			catch(Exception e)
			{
				System.out.println("Something woring");
			}
			finally
			{
				System.out.println("Bye");
			}
		}

	}

}
