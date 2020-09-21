package DaysProgram.DaysProgram;

import java.util.Arrays;

public class SmallestLargestOfArray {

	public static void main(String[] args) {
	
		int a[]= {2,3,1,4}; //1,2,3,4
		Arrays.sort(a);
		System.out.println("Array length is: " +a.length);
		
		System.out.println("Smallest number of array is : " +a[0]);
		System.out.println("Largest number of array is : " +a[3]);
	}



}
