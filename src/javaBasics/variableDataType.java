package javaBasics;

public class variableDataType {

	public static void main(String[] args) {
		/*
		int x=100;
		float price=(float) 300.10;
		double p2 = 100.20;
		String Name = "Vaibhav";
		*/
		char Grade = 'A';
		
		
		System.out.print("Hello Tester: ");
		System.out.println(Grade);
		
		/*
		 * byte, short, int, long -----> number without decimal 
		 * float, double ------> decimal number 
		 * char --------> single character (single quote) 
		 * boolean ---> true/false
		 */
	}

}

/*
--------
Variables and Data types
-----------------------
Variable is a container which can hold data.
to represent data we need variables.

int x=100
int age=30
float price=150.50
double price=150.50
String name="John"
char grad='A'

Data types
-----------
Data type represents type of data.

1) Premitive

byte, short, int, long -----> number without decimal
float, double ------> decimal number
char   --------> single character (single quote)
boolean   ---> true/false


2) Non-premitive/ Derived /Collections
String
ArrayList
HashMap
HashSet
Object
etc......

DataType	Size			Description
--------------------------------------------------
byte		1 byte			Stores whole numbers from -128 to 127

short		2 bytes	    	Stores whole numbers from -32,768 to 32,767
int			4 bytes			Stores whole numbers from -2,147,483,648 to 2,147,483,647
long		8 bytes			Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

float		4 bytes			Stores fractional numbers. Sufficient for storing 7 decimal digits
double		8 bytes			Stores fractional numbers. Sufficient for storing 15 decimal digits

boolean		1 bit		    Stores true or false values
char		2 bytes			Stores a single character/letter


char ch='A'; 	//valid 
char ch='ABC';  // invalid
String ch='ABC'    // invalid

String ch='A'     // invalid
String ch="A"     // valid


boolean b=true;   //valid
boolean b="true"   // invalid

String s=true;   // not valid

String s="true";  // valid

*/