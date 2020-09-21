package DaysProgram.DaysProgram;

public class FloydsTriangle {

	public static void main(String[] args) {
	
		int num =0;
		//to create 7 rows of triangle 
		for(int i=1;i<8;i++)
		{
			for(int j=0;j<i;j++) // number of columns equals row number 
			{
				num = num+1; // to print the value from 1 sequentially
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}

}
