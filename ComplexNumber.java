package DaysProgram.DaysProgram;

public class ComplexNumber {
	
	double real,img;
	
	public ComplexNumber(double r, double i) {
		this.real=r;
		this.img=i;
	}
	
	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2)
	{
		ComplexNumber temp=new ComplexNumber(0,0);
		temp.real=n1.real+n2.real;
		temp.img=n1.img+n2.img;
		return temp;
	}

	public static void main(String[] args) {
		
		ComplexNumber n1 = new ComplexNumber(5.4, 2);
		ComplexNumber n2 = new ComplexNumber(1.5,6.0);
		ComplexNumber temp = add(n1 ,n2);
		System.out.println("Sum of two complex number is : " + temp.real + " +" + temp.img+ "i");
		
	
		
	}

}
