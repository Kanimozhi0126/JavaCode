package DaysProgram.DaysProgram;

import java.util.Scanner;

public class AddElementsArray {

	public static void main(String[] args) {
		//int a[];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total number of array elements:");
		int a = scan.nextInt();
		int n[]= new int[a];
		System.out.println("enter all the elements of array:");
		for(int i=0;i<a;i++){//for reading array
            n[i]=scan.nextInt();
            //System.out.println(n[i]);

        }

        for(int i: n){ //for printing array

            System.out.println("User entered Array : " +i);

        }
        int sum =0;
        for(int j=0;j<n.length;j++)
        {
        	sum = sum+n[j];
        }
        System.out.println("Sum of array elements : " +sum);

	}

}
