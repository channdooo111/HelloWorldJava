 class Emp
 {
	 int eid;
	 int salary;
	 static String ceo;
	 
	 static {
		 ceo = "larry";
	 }
 
	 public Emp()
	 {
		 eid = 2;
		 salary = 400;
	 }
	 
 public void show()
 {
	 System.out.println(eid + " : " + salary + " : " + ceo);
 }
 }
public class StaticDemo {
	
	public static void main(String[] args)
	{
		Emp chandu = new Emp();
		chandu.eid = 100;
		
				
		Emp ram = new Emp();
		
	chandu.show();
	ram.show();

}
}