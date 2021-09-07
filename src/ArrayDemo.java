
public class ArrayDemo {

	public static void main(String[] args) {
		{
			int num[] = {8,12,76,54};
			
			int num1[][] = {
					 
					{1,2,3,4},
					{2,4,8}, //jagged array 
					{5,6,7,9}
			};
			
			
			
			for (int i = 0; i< num1.length; i++)
			{
				for(int j =0;j< num1[i].length;j++)
				{
		
				System.out.print(" " + num1[i][j]);
			}
			System.out.println();
		}

	}

	}}
