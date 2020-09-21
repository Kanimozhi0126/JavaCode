package DaysProgram.DaysProgram;

import java.util.Arrays;

public class StringArrayCalc {

	public static void main(String[] args) {
		String[] a = {"Sample", "Kani", "Vimal", "Murugesan", "Thangam"};
		Arrays.sort(a);
		for(int i =0;i<a.length;i++)
		{
			char[] charArray = a[i].toCharArray();
			if(charArray.length>5)
			{
				System.out.println("Greater element of array is : "+a[i]);
			}
			
			
		}
		System.out.println();
		

	}

}
