package DaysProgram.DaysProgram;

public class StringSwapping {

	public static void main(String[] args) {
		String a="Kanimozhi";
		System.out.println("Initial String is :"+a);
		int length = a.length();
		System.out.println("Length of string is :"+length);
		String substring1 = a.substring(0, 4);
		String substring2 = a.substring(4,9);
		
		char first = substring1.charAt(0);
		char last = substring1.charAt(3);
		String half = substring1.replace(first, last);
		
		char next = substring2.charAt(4);
		String full = substring2.replace(next, first);
	
		String res = half.concat(full);
		System.out.println("Final interchanged String is : "+res);
		
		
		
	}

}
