class Cal
{
	public int add(int ...n)//{4,5,6,7,8,9}// variable length arguments
	{
		int sum =0;
		for (int i : n)
		{
			sum = sum + i;
		}
		return sum;
	}
}
public class VarargsDemo {

	public static void main(String[] args) 
	{
		Cal obj1 = new Cal();
		System.out.println(obj1.add(4,5,6,7,8,90));

	}

}
