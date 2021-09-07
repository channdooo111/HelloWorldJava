class Casio
{
	
	public Casio()
	{
		num1 = i;
		num2 = j;
	}
	
	public Casio(int k)
	{
	num1 = k;	
	}
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i, double j)
	{
		System.out.println(i+j);
	}
}
public class MethodOverLoadingDemo {
	
	public static void main(String[] args)
	{
		Casio obj = new Casio();
		obj.add(5 ,2);
		obj.add(4,5,6);
		obj.add(4.5,5.6);
	
}

}
