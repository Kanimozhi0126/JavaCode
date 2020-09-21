package DaysProgram.DaysProgram;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows: ");
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		scan.close();
	       for (int i = 0; i <rows; i++) { 
	    	   
	            // loop to print the number of spaces before the star 
	            for (int space = rows; space > i; space--) { 
	                System.out.print(" "); 
	            } 
	  
	            // loop to print the number of stars in each row 
	            int val = 1;
	            for (int j = 0; j <= i; j++) { 
	            	
	                System.out.print(val+" "); 
	                val=val*(i-j)/(j+1);//formula to add the numbers in previous row 
	            } 
	  
	            // for new line after printing each row 
	            System.out.println(); 
	        } 
	}
}
