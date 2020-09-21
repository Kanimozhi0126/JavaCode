package DaysProgram.DaysProgram;

public class ArithmeticOperations {
	
	public void methodOne(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Sum of two numbers : " +sum);
	}
	
	public void methodOne(int a, int b)
	{
		int mul= a*b;
		System.out.println("Multilication of two numbers : " +mul);
	}
	
	public void methodOne(String one, String two)
	{
		String concat = one+two;
		System.out.println("My name is : " +concat);
	}

	public static void main(String[] args) {
		
		ArithmeticOperations ops = new ArithmeticOperations();
		ops.methodOne(5, 8, 10);
		ops.methodOne(10, 20);
		ops.methodOne("Kani", "Vicky");
		
				
		
		

	}

}
