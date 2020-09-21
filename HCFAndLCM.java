package DaysProgram.DaysProgram;

import java.util.*;

public class HCFAndLCM {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fisrt Number : ");
		System.out.println("Enter second Number : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int min,hcf=1,lcf,i;
		min=a<b?a:b;
		System.out.println(min);
		for(i=1;i<min;i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		System.out.println(hcf);
		lcf=a*b/hcf;
		System.out.println(lcf);
				

	}

}
