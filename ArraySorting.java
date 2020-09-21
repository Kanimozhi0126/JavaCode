package DaysProgram.DaysProgram;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] array= {2,4,5,2,12,0};
		int a;
		Arrays.sort(array);
		System.out.println("Size of the array is : " +array.length);
		System.out.println("Sorted array is : " );
		for(int i=0;i<array.length;i++)
		{
			
			System.out.println(array[i]);
		}

	}

}
