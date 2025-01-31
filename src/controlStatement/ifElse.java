package controlStatement;

/*conditional statements
---------------------
if
if else
nested if else
if else ladder
switch case*/

public class ifElse {
	public static void main(String[] args) {
	int a = 10;
	
	//if statement
	if(a == 10) {
		System.out.println("Welcome!!!");
	}
	
	//if- else statement
	if(a>=18)	{
		System.out.println("You are Eligible");
	}
	else{
		System.out.println("You are Not Eligible");
	}
	
	// if- else statement
	if(a % 2 == 0) {
		System.out.println("Number is Even");
	}
	else {
		System.out.println("Number is Odd");
	}
	
	//nested if else
	if(a == 10) {
		if(a > 0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
	}
	else{
		System.out.println("Number is Zero");
	}
	
	//if else ladder
	int b= 30, c=20;
	if(a>b && a>c) {
		System.out.println(a+" is Greater Number");
	}
	else if(b>a && b>c) {
		System.out.println(b+" is Greater Number");
	}
	else{
		System.out.println(c+" is Greater Number");
	}
}
}


