// IS-A , HAS-A
class Caluculator // super or parent class, base
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class CaluAdv extends Caluculator // sub or child class, derived class
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		CaluAdv c1 = new CaluAdv();
		int result1 = c1.add(5, 4);
		int result2 = c1.sub(6, 3);
		
		System.out.println(result1);
		System.out.println(result2);
		

	}

}
