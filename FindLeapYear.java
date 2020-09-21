package DaysProgram.DaysProgram;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
	
		Scanner scan = new Scanner(System.in); // to raed the user input

		int year = scan.nextInt(); // to read the user input in next line in console
		
	if(year%4 == 0)
	{
		System.out.println("Given year is leap year : " +year);
	}
	else
		System.out.println("Given year is not Leap year : "+year);
		

		
	}

}
