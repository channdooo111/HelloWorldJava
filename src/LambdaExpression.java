interface Abc 
{
	void show();
}
public class LambdaExpression {

	public static void main(String[] args) {
		
		Abc objj= () -> System.out.println(" Im the best");
		
		objj.show();

	}

}
