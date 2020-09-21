package DaysProgram.DaysProgram;

public class AverageOfArray {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int length = a.length;
	System.out.println("Length of array : " +length);
	int sum =0, average = 0;
	
	for(int i =0; i<a.length; i++)
	{
		sum = sum+a[i];
	}
	System.out.println("Sum of Array is : " +sum);
	
	average = sum/length;
	System.out.println("Average of two numbers is : " +average);
	
	}

}
