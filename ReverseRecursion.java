package DaysProgram.DaysProgram;
import java.util.*;

public class ReverseRecursion {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int originalnum = scan.nextInt();
	int num =0;
	while(originalnum!=0)
	{
	int res = originalnum%10;
	num = num*10 + res;
	originalnum = originalnum/10;

	}
	System.out.println(num);
	
	}

}
