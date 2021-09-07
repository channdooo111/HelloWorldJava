 
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =5;
		Integer ii = new Integer(i); // Boxing or Wrapping
		
		int j = ii.intValue(); // Unboxing
		
		Integer value = i; // autoboxing 
		
		int k = value; // auto unboxing
		
		String str = "123";
		
		int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
