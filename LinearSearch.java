package DaysProgram.DaysProgram;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	boolean flag = true;
	int[] array= {1,2,3,4};
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number to be found in array: ");
	int num = scan.nextInt();
	
	for(int i =0;i<array.length;i++)
	{
		if(num==array[i])
		{
			System.out.println("Number is found in Array :" +array[i]);
		}
		else
			flag = false;
		
			
	}
	if(flag==false)
	{
		System.out.println("Number not found in array");
	}

	}

}
