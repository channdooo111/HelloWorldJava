class Over
{
	public void show()
	{
		System.out.println("asdasd");
	}
}

class Over2 extends Over
{
	public void show()
	{
		super.show();
		System.out.println("fdsda");
	}
}
public class OverRidding {

	public static void main(String[] args) {
		
		Over  f = new Over2();
		f.show();

	}

}
