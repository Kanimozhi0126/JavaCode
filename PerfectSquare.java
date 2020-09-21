package DaysProgram.DaysProgram;

public class PerfectSquare {
	
public static void main(String[] args) {

	int num = 16;
	//this function gives the squeare root number
	double sum = Math.sqrt(num);
	// to get the whole number or round off number from double value then use Math.floor(sum);
	System.out.println(sum);
		/* to find the sum of given digit
		 * int sum = 0; while(num!=0) { sum = sum+(num%10); num =num/10; }
		 * 
		 * 
		 * System.out.println(sum);
		 */
	if(sum-(int) Math.sqrt(num)==0) {
		
		System.out.println("Given number is a perfect square : " +num);
		
	}
	else
		System.out.println("Not a perfect square");
}

}
