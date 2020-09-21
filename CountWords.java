package DaysProgram.DaysProgram;

public class CountWords {

	public static void main(String[] args) {
	String[] a= {"Thangam","Murugesan","Murugan","Kani","Vimal"};
	//int count = 0;
	int value=0;
	int count =0;
	for(int i=0;i<a.length;i++)
	{
		int length = a[i].length();
		char charAt = a[i].charAt(a[i].length()-1);
		if(charAt=='m')
		{
			
			count=count+1;
			System.out.println("string ending with m: "+a[i] + " and " +count);
		}
		
		else if(charAt=='n')
		{
			
			value =value+1;
			System.out.println("String ending with n: "+a[i] + " and " +value);
		}
	}

	}

}
