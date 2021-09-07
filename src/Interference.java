
// we can create object of interface we can only create reference
// we can achive multiple inhertence using interface
// all the method interface is by default abtract
// we cant defir method interface 
interface Writer
{
	void write();
}

class Pen implements Writer
{
	public void write()
	{
		System.out.println(" I am pen");
	}
}
	
class Pencil implements Writer
{
	public void write()
	{
		System.out.println("I am pencil");
	
	}
}
class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}

public class Interference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		k.doSomething(p);

	}

}
