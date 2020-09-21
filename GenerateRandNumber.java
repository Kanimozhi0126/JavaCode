package DaysProgram.DaysProgram;

import java.util.Random;

public class GenerateRandNumber {

	public static void main(String[] args) {
	
		int num;
		//Random class in Java helps to generate random numbers of any type
		Random randomNumber = new Random();
		//to get any random number
		num = randomNumber.nextInt();
		System.out.println("Random Number is :" + num);
		
		//to get random within desired limit
		num=randomNumber.nextInt(10);
		System.out.println("Random Number within 10 : "+num);

	}

}
