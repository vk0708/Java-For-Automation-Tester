# JAVA

- [Source Code Folder](https://github.com/vk0708/Java-For-Automation-Tester/tree/main/src)
	src folder contains code with notes(in Comments)
  
- [Introduction and Java Basics](README.md#Introsuction)

- [Variables and Data Types](README.md##IntroductiontoVariables)

- [Type Casting and Overflow & Underflow](README.md##TypeCastinginJava)

All contains are dropdown, So click on Arrow to view

## Introduction
• Java is a programming language that helps developers build software applications. It follows 
an object-oriented approach, meaning it organizes code into reusable objects.

<details>

### Types of Programming Languages
Programming languages can be grouped based on how they're structured:

1. Structured Programming Languages:
    o Examples: C, Python
    o These languages use a logical flow of commands.
    
2. Object-Based Programming Languages:
    o Examples: Visual Basic (VB), VBScript, Python
    o They support some object-oriented programming (OOP) ideas like classes and objects, but not inheritance.
    
3. Object-Oriented Programming (OOP) Languages:
    o Examples: C++, Java, C#, Python
    o These languages support all OOP concepts.

###  OOP (Object Oriented Programming) Concepts
1. Class
2. Object
3. Polymorphism
4. Inheritance
5. Abstraction
6. Encapsulation
</details>

## Java Basics 
<details>

<summary>Basics of Java</summary>
### Java Features

1. Platform Independent: Java can run on any device with Java Runtime Environment (JRE), 
making it versatile.

2. Case Sensitive: Java treats uppercase and lowercase letters as different (e.g., a is not the 
same as A).

### Java Components

1. JDK (Java Development Kit): Tools for developing Java applications.
2. JRE (Java Runtime Environment): Needed to run Java applications.
3. JVM (Java Virtual Machine): Runs the Java code on your device.

### Core Java vs. Advanced Java

• Core Java: Focuses on the basics (Java SE).
• Advanced Java: Covers more specialized topics (Java EE), like web services and databases.

### Java Versions

• JDK 8: Created by Sun Microsystems, now managed by Oracle.
• Latest Version: JDK 22.
• Recommended Version: JDK 11+ for most uses.
• Java Distributions:
    o Community Edition: Free and open-source (OpenJDK).
    o Licensed Edition: Commercial with long-term support (Oracle JDK).

### JDK Download & Installation (Refer the installation document)

• Download and Install JDK
• Set Java Path inside environment variables
• Verify Installation inside command prompt
Eclipse IDE Download & Installation (Refer the installation document)
• Download Eclipse IDE and install it.
• Launch eclipse and create new java project.

### Setting Up a Java Project in Eclipse

1. Create a New Java Project: File → New → Java Project
2. Create a New Package: Right-click on src → New → Package
3. Create a New Class: Right-click on the package → New → Class

### Java Naming Conventions

1. Start with an uppercase letter (e.g., MyClass).
2. Class names shouldn't begin with numbers.
3. Underscores (_) are allowed in class names.
4. Avoid using special characters.
5. Numbers are allowed but not as the first character.

### Comments in Java

• Single-Line Comment: // This is a comment
• Multi-Line Comment: /* This is a multi-line comment */

### Keyboard Shortcuts

• Auto-Complete System Output: Type Syso then press Ctrl + Space (or CMD + Space on Mac).
• Single-Line Comment: Press Ctrl + /
• Multi-Line Comment: Press Ctrl + Shift + /

[Back to Top](README.md#java)

</details>

## Introduction to Variables

A Variable is a name given to a memory location. It is used to store a value that may vary. Java is a statically typed language, and hence, all the variables are declared before use.  

<details>
<summary>Read More</summary>

### Variable Declaration
In Java, we can declare variables as follows:

type: Type of the data that can be stored in this variable. It can be int, float, double, etc.
name: Name given to the variable.
data_type variable_name;

Example: int x;

In this way, we can only create a variable in the memory location. Currently, it doesn’t have any value. We can assign the value in this variable by using two ways:
• By using variable initialization.
• By taking input
Here, we have discussed only the first way, i.e. variable initialization. We will discuss the second way later.

data_type variable_name = value;
Example: int x = 10;

### Java Keywords:
 
Keywords in Java are also known as reserved words. These are the predefined words therefore they can’t be used as a variable name. If we will use keywords as a variable name, the result will be a compile-time error. The list of all the Java Keywords is given below.

[Back to Top](README.md#java)
</details>

## Data Types in JAVA
The data type defines the type of value that can be stored in a variable. For example, if a variable has an int data type, it can only store an integer value. In java, there are two categories of data types.

<details>
<summary>Data Type</summary>


1. Primitive Data Type: A primitive data type is predefined by the language and is named by a keyword or reserved keyword. There are eight types of primitive data types in java such as boolean, char, int, short, byte, long, float, and double.
- boolean: boolean data type specifies only one bit of information and it is used to store only two possible values either true or false.
- byte: byte data type is 8 bit signed two’s complement integer. Its value lies between -128 to 127. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type is most commonly used to save memory in large arrays.
- short: short data type is a 16-bit signed two’s complement integer. It can hold any number between -32768 to 32767 (inclusive). Like byte data type, it is commonly used to save memory in large arrays.
- int: int data type is 32-bit signed two’s complement integer. It can hold the number between -2,147,483,648 to 2,147,483,648. The default value of the int data type is 0.
long: long data type is 64-bit two’s complement integer. It can hold the number between -2^63 to 2^63-1. The default value of long data type is 0.
- float: float data type is used to store floating-point numbers. The float data type is a single-precision 32-bit IEEE 754 floating-point. It can hold 6 to 7 decimal digits. It is recommended to use float instead of double if you need to save memory in large arrays of floating-point numbers. The default value of float is 0.0f.
- double: double data type is generally used to store decimal values. The double data type is a double-precision 64-bit IEEE 754 floating-point. For decimal values, this data type is generally the default choice. The default value of double is 0.0d.
- char: The char data type is used to store characters. The char data type is a single 16-bit Unicode character. 
 

2. Non-Primitive Data Type: Non-Primitive data type refers to the objects. ArrayList and String are some of the examples of Non-Primitive data type. We will discuss the Non-Primitive data type later. 

Example
```java
// Primitive Data Types
int price = 5000;                               // Integer Value
float rateOfInterest = 5.99f;                   // Floating point number
char ch = 'a';                                  // Character

// Non-Primitive Data Types
String str = "Coding Ninjas";                   // String
```
[Back to Top](README.md#java)

</details>

## Types of Variable

A variable is a name given to memory location. There are three types of variables in java.

- Local Variable.
- Instance Variable.
- Static variable

<details>
<summary>
Read More here
</summary>

1. Local Variables: A variable that is defined inside a block, method body, or constructor is called a local variable. These variables are created when the methods are called and they get destroyed when the methods are executed and return to the caller. 
The initialization of the local variable is mandatory. If you don’t initialize the variable before use, the compiler will give a compile-time error.

```java
public class Addition {
   
   // Function to add two numbers
   public void add() {
      // Local variables
      int a = 10;
      int b = 20;
      int c = a + b;
      
      // Printing the sum
      System.out.println(c);
   }

   // Driver Code
   public static void main(String args[]) {
      // Creating an object of Addition class
      Addition obj = new Addition();
      // Function Call
      obj.add();
   }
}
```
 2. Instance Variables: A variable that is declared inside the class but outside the method body, block, or constructor is known as an instance variable. It is a non-static variable. These variables are created when an instance (object) of the class is created and are destroyed when the object is destroyed. Initialization of the instance variable is not mandatory. Even If you don’t initialize the instance variable, it has a default value in it. Instance variables can be accessed only by creating the object of the class.
 
```java
class Student {

	// These are instance variables
	// these are declared inside the 
	// class but outside the method body
	String name;
	int rollno;
}

public class StudentRecords {
	public static void main(String args[]) {
      	// Creating Student class object
    	Student obj = new Student();

       // Assigning values in the variables
    	obj.name = "Ram";
    	obj.rollno = 10;

      	// Printing name and rollno
    	System.out.println(obj.name);
    	System.out.println(obj.rollno);
	}
}
```

3. Static Variables: A variable that is declared as static is known as a static variable. It is also known as a class variable. These variables are created at the beginning of the program execution and destroyed automatically when the program execution ends. We can create only a single copy of a static variable. To access the static variables, we don’t need to create the object of the class. We can simply access the static variable as
 ```java
 class Student { 
 
	// static variables 
	public static int rollno; 
	public static String name = "Ram"; 
} 

public class StudentDemo { 
	public static void main(String args[]) 
	{ 
		// accessing static variable without creating object 
		Student.rollno = 10; 
		System.out.println(Student.name + " 's rollno is :" + Student.rollno); 
	} 
} 
 ```
[Back to Top](README.md#java)

</details>

## TypeCasting in Java

TypeCasting in Java is the process of converting one primitive data type into another. TypeCasting can be done automatically and explicitly. 

<details>

When we assign the value of one data type to another data type, then there is a chance that two data types might not be compatible with each other. The Java compiler will automatically perform the conversion if the data types are consistent. This type of conversion is known as Automatic Type Conversion. If the java compiler cannot perform the conversion automatically, they need to be cast explicitly. 

There are two types of TypeCasting in Java.

• Widening or Automatic Type Conversion.

• Narrowing or Explicit Type Conversion.

1. Widening or Automatic Type Conversion: When we assign a value of a smaller data type to a large data type, this process is known as Widening Type Casting. It is also known as Automatic Type Conversion because the Java compiler will perform the conversion automatically. This can happen only when the two data types are compatible. 

```java
byte -> short -> int -> long -> float -> double ( Widening or Automatic Type Conversion)
 ```
### Example 
```java
public class WideningConversation {
    public static void main(String args[]) {

        // Automatic Type Conversion.
        int i = 2147483647; // Int max value in java.
        long l = i; // Automatically converted to long, now we can extend l's value.
        l = l + 1;
        double d = l; // Automatically converted to double.
        System.out.println("Int value : " + i);
        System.out.println("Long value : " + l);
        System.out.println("Double value : " + d);
    }
}

## Output:
Int value : 2147483647
Long value : 2147483648
Double value : 2.147483648E9
```
1. Narrowing or Explicit Type Conversion: When we assign a value of a large data type to a small data type, the process is known as Narrowing Type Casting. This can’t be done automatically. We need to convert the type explicitly. If we don’t perform casting, the java compiler will give a compile-time error. 
```java
double -> float -> long -> int -> short -> byte  ( Narrowing or Explicit Type Conversion)
```
### Example:
```java
public class ExplicitConversation {
	public static void main(String args[]) {

		// Explicit Type Conversion
		double d = 25.123;
		int i = (int) d;
		byte b = (byte) i;
		System.out.println("Double value : " + d);
		System.out.println("Int value : " + i);
		System.out.println("Byte value : " + b);
	}
}

## Output
Double value : 25.123
Int value : 25
Byte value : 25
```
</details>

## Overflow and Underflow in Java

Overflow in java happens when we assign a value to a variable that is more than its range and Underflow is opposite to overflow. In case of overflow and underflow, the Java compiler doesn’t throw any error. It simply changes the value. 

<details>
For example, in the case of an int variable, its size is 4 bytes or 32 bits. The maximum value of int data type is 2,147,483,647  (Integer.MAX_VALUE) and after incrementing 1 on this value, it will return -2,147,483,648 (Integer.MIN_VALUE). This is known as overflow. The minimum value of int data type is -2,147,483,648  (Integer.MIN_VALUE) and after decrementing 1 on this value, it will return 2,147,483,647 (Integer.MAX_VALUE). This is known as underflow in Java.

Example:
```java
public class OverflowExample {
	public static void main(String args[]) {	
		// Overflow
		int overFlow = 2147483647;
		System.out.println(“Overflow : “ + (overFlow + 1));         
		
		// Underflow
		int underFlow = -2147483648;
		System.out.println(“Underflow : “ + (underFlow - 1));     	
 	}
}

- Output:
Overflow : -2147483648
Underflow : 2147483647
```
</details>

## Input / Output In Java
Before discussing how to take input in java, let’s first understand how to print a statement in java. 

1. Using println() method <br>
2. Using print() method <br>
3. Using printf() method

<details>
<summary>Read More Here</summary>

### 1.Using println() method: 
In java, we usually use println() method to print the text on the console. The text is passed as the parameter to this method in the form of string. This method prints the text on the console, and after printing the text, the cursor remains at the start of the next line at the console. The next printing takes place from the next line.<br>
Example:
```java
System.out.println(“Vaibhav”);
System.out.println(“Kale”);
#Output:
Vaibhav
Kale
```

### 2. Using print() method: 
In java, we usually use print() method to print the text on the console. The text is passed as the parameter to this method in the form of string. This method prints the text on the console, and after printing the text, the cursor remains at the end of the text at the console. The next printing takes place from just here.<br>
Example:
```java
System.out.print(“Vaibhav”);
System.out.print(“Kale”);
# Output:
VaibhavKale
```

### 3.Using printf() method: 
The printf() method in java is used to print formatted data on the console. The print() and println() method take single arguments, but printf() method may take multiple arguments.<br>
Example:
```java
// this will print upto 2 decimal places
System.out.printf(“"Formatted with precision: PI = %.2f\n", Math.PI”);

// Automatically appends Zeros to the 
// rightmost part of the decimal
float n = 5.2f;
System.out.printf(“Formatted to specific width: n = %.4f\n", n”);

Output:
Formatted with precision: PI = 3.14
Formatted to specific width: n = 5.2000
```
### Other Example:
```java
public class Test {
	public static void main(String args[]) {
		int age = 21;
		String firstName = "King";
		String lastName = "Kong";

		System.out.println("My name is " + firstName + " " + lastName);
		System.out.println("My age is " + age);
	}
}
** Output:
My name is King Kong
My age is 21
```
</details>

[Back to Top](README.md#java)
<hr>

## Reference
- Coding Ninja
- SDET-QA
- College Notes

## Author 

• Vaibhav R. Kale - QA Tester<br>
[Code360](https://www.naukri.com/code360/profile/CoderVK) &nbsp; &nbsp;
[LinkedIn](https://www.linkedin.com/in/vaibhav-kale)


