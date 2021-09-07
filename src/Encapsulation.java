// Encapsulation = binding data with methods
// this is one way to access variable in main method 
class Student
{
	private int rollno;
	private String name;
	
	// Getter and Setters
	
	public void setRollno( int r)
	{
		rollno = r;
	}
	public int getRollno()
	{
		return rollno; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollno(12);
		s1.setName("chandu");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		

	}

}
