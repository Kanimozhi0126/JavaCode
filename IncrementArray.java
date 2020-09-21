package DaysProgram.DaysProgram;

public class IncrementArray {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4};
		
		
		for(int i =0;i<a.length;i++)
		{
			//System.out.println("Old Array is : "+a[i]);
			a[i]=a[i]+1;
			
			System.out.println("New Incremented Array is : " +a[i]);
			
		}
		

	}

}
