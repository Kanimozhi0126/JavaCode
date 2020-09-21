package DaysProgram.DaysProgram;

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows: ");
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		scan.close();
	       for (int i = 1; i <= rows; i++) { 
	    	   
	            // loop to print the number of spaces before the star 
	            for (int space = rows; space >= i; space--) { 
	                System.out.print(" "); 
	            } 
	  
	            // loop to print the number of stars in each row 
	            for (int j = 1; j <= i; j++) { 
	                System.out.print("* "); 
	            } 
	  
	            // for new line after printing each row 
	            System.out.println(); 
	        } 
	}
}
