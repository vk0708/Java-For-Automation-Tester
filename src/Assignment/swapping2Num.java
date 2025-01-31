package Assignment;

public class swapping2Num {

	public static void main(String[] args) {
		/*
		int a = 10, b = 30;
		int c;
		
		c = a;
		a = b;
		b = c;
		System.out.println("After: a = " + a + " b = " + b);
		 * */
		
		
		// Without Third Variable 
		int a = 10, b = 30;
		System.out.println("a = " + a + " b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After: a = " + a + " b = " + b);
	}

}
