# JAVA

- [Source Code Folder](https://github.com/vk0708/Java-For-Automation-Tester/tree/main/src)
	src folder contains code with notes(in Comments)
  
- [Introduction and Java Basics](README.md##Introduction)

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

## Taking input in java
In Java, there are mainly two ways to get the input from the user.
- Using Scanner class
- Using BufferedReader class

### 1. Using Scanner class: 
Scanner is a class in java that is used to take input from the user. It is present in the java.util package. Scanner class is one of the most preferable ways to take input from the user. This class is used to read the input of primitive types such as int, double, long, etc. and String. You need to import the java.util package before using the Scanner class.

Methods of Scanner class in Java:<br>
![image](https://github.com/user-attachments/assets/7d875c54-a6b6-4575-918e-d084d60ce6f9)

Example 1: Taking int value from the user
```java
import java.util.Scanner;
class TakingInputFromUser {
     public static void main(String argo[]) {
 
            // Creating an object of Scanner class
            Scanner sc = new Scanner(System.in);
 
            // Read integer value from the user
            System.out.println(“Enter first number :”);
            int a = sc.nextInt();
 
            System.out.println(“Enter second number :”);
            int b = sc.nextInt();
 
          // Adding two values
          int c = a + b;
 
         // Printing the sum
         System.out.println(“Sum is : “ +c);
    }
}

## Output:
Enter first number : 10
Enter second number : 20
Sum is : 30
```
Example 2: Taking String from the user
```java
import.java.util.Scanner;
class TakingInputFromUser {
      public static void main(String arg[]) {
             Scanner sc = new Scanner(System.in);
             System.out.println(“Enter a String : “);
             // Read a string from the user
             String str = sc.nextLine();
             System.out.println(“Your entered string is : “ + str);
    }
}
```
</details>

## Exercise
[Drive Folder- Java Code](https://drive.google.com/drive/folders/13RLZ635Pk6msN_tWA2gGjXme3wLFthBh?usp=sharing)

## Operators in Java
Operators in Java are the special symbol specific operations on one, two, or three operands and then return a result. There are different types of operators available in Java which are given below:

- Arithmetic Operators
- Unary Operators
- Assignment Operators
- Relational Operators
- Logical Operators
- Bitwise Operators
- Ternary Operators
- Instance of Operators

<details>
<summary>Operators in Detailed</summary>

### Arithmetic Operators
Arithmetic Operators in Java are used to perform mathematical operations, i.e. Addition, Subtraction, Multiplication, and Division etc. The basic arithmetic operators in Java are given below:

- Addition Operator (+) : It is used to add two numbers.
- Subtraction Operator (-) : It is used to subtract two numbers.
- Multiplication Operator (*) : It is used to multiply two numbers.
- Division Operator (/) : It is used to divide two numbers.
- Modulus Operator (%) : It is used to return the remainder of the division operation.

```java
public class ArithmeticOperators {
   public static void main(String args[]) {
      
      // Taking two numbers
      int a = 50;
      int b = 20;
   
      // Performing addition operation
      System.out.println(“Addition of “ +a+ “ and” +b+ “ is : “ +(a+b));

      // Performing subtraction operation
      System.out.println(“Subtraction of “ +a+ “ and” +b+ “ is : “ +(a-b));

      // Performing multiplication operation
      System.out.println(“Multiplication of “ +a+ “ and” +b+ “ is : “ +(a*b));

      // Performing division operation
      System.out.println(“Division of “ +a+ “ and” +b+ “ is : “ +(a/b));

      // Performing modulus operation
      System.out.println(“Modulus of “ +a+ “ and” +b+ “ is : “ +(a%b));
   }
}

Output:
Addition of 50 and 20 is : 70
Subtraction of 50 and 20 is : 30
Multiplication of 50 and 20 is : 1000
Division of 50 and 20 is : 2
Modulus of 50 and 20 is : 10

```
<hr>

### Unary Operators
 Unary Operators in Java are the types of operators that require only one operand. They form various operations on single operands such as incrementing or decrementing the value by one, negation of an expression, or inverting the value of a boolean. Let’s understand the various unary operators with an example.

#### Unary minus operator (-): 
This operator can be used to convert a negative value into a positive value or positive value into a negative value.
```java
      int num1 = 10;
       num1 = -num1;
       System.out.println(“Negative Value : “ +num1);
       
Output: Negative Value : -10
```
#### Unary NOT Operator (!): 
This operator is used to convert the true to false and vice versa.
```java
// Using unary NOT operator.
       System.out.println(“!(a < b) = “ + !(a < b));
```
#### Increment Operator (++): 
This operator is used to increment the value by 1, There are two types of increment operator

1. Post-increment operator: Post increment operator is used to increment the value of the variable after it has been evaluated for use in the expression.

2. Pre-increment operator: Pre increment operator is used to increment the value of the variable before it’s evaluated in the expression.

#### Decrement Operator (--): 
This operator is used to decrement the value by 1. There are two types of decrement operators.

1. Post-decrement operator: Post decrement operator is used to decrement the value of the variable after it has been evaluated for use in the expression.

2. Pre-decrement operator: Pre decrement operator is used to decrement the value of the variable before it’s evaluated in the expression. 

#### Bitwise Complement (~): 
This operator is used to return the one’s complement representations of the input value.i.e, with all bits inverted, which means it makes every 0 to 1, and every 1 to 0. 

<hr>

### Assignment Operators
The Assignment operators are used to assign a value to the variable. In Java, we can use many assignment operators. These are explained below:

#### 1) +=: 
This assignment operator is used to add the left operand with the right operand and then assigning it to a variable on the left.<br>
- int num = 10;  <br>
      num += 20;

#### 2) -=: 
This assignment operator is used to subtract the left operand with the right operand and then assign it to a variable on the left. <br>
- num -= 10;

#### 3) *=: 
This assignment operator is used to multiply the left operand with the right operand and then assign it to a variable on the left.
- num *= 5;

#### 4) /=: 
This assignment operator is used to divide the left operand with the right operand and then assign it to a variable on the left. <br>
- num /= 2;

#### 5) %=: 
This assignment operator is used to modulo the left operand with the right operand and then assign it to a variable on the left. <br>
- num %= 2;

<hr>

### Relational Operators
The Relational operators are used to check the relationship between two operands. This operator is also called a comparison operator because it is used to make a comparison between two operands. The result of these operators is always boolean value. These operators are used in if statements and loops. There are many types of relational operators, which are given below:

#### i) Equal to operator (==): 
This operator is used to check whether the two operands are equal or not. If they are equal, it returns true; otherwise, it returns false.

#### ii) Not Equal to operator (!=): 
This operator is used to check whether the two operands are equal or not. It returns true(1) if the left operand is not equal to the right operand; otherwise, it returns false(0).

#### iii) Greater than operator (>): 
This operator is used to check whether the first operand is greater than the second operand or not. It returns true(1) if the first operand is greater than the second operand and false(0) if not.

#### iv) Greater than equal to the operator (>=): 
This operator is used to check whether the first operand is greater than or equal to the second operand or not. It returns true(1) if the first operand is greater than or equal to the second operand; otherwise, it returns false(0).

#### v) Less than operator (<): 
This operator is used to check whether the first operand is less than the second operand or not. It returns true(1) if the first operand is less than the second operand else returns false(0).

#### vi) Less than or equal to operator (<=): 
This operator is used to check whether the first operand is less than or equal to the second operand or not. It returns true(1) if the first operand is less than or equal to the second operand; else, return false(0).
<hr>

### Logical Operators:
These operators are used to perform logical operations such as OR, AND, and NOT operation. It operates on two boolean values, which return true or false as a result. There are three types of Logical Operators in Java:

#### i) Logical AND operator (&&): 
This operator returns true(1), if both the conditions are true else returns false(0). 

#### ii) Logical OR operator (||): 
This operator returns true(1) if any one of the conditions is true. 

#### iii) Logical NOT operator (!): 
This operator is used to reverse the operand’s value. If the operand’s value is true, it returns false(0), and if the value of the operand is false, it returns true(1).
<hr>

### Bitwise Operators
 The Bitwise operators are used to perform bit manipulation on numbers. There are various types of Bit operators that are used in Java.
 
#### i) Bitwise AND operator (&):  
It takes two numbers as operands and does AND on every bit of two numbers. The result of AND is 1 only if both bits are 1. Mind that the commutative property holds true here.
That is,<br>
              1 & 1 = 1 <br>
              1 & 0 = 0 

Example:
```java
int a = 6;
      int b = 7;
 
      // Binary representation of 6 is 0110
      // Binary representation of 7 is 0111
      // Result is                     0110 = 6
      System.out.println(“a & b = “ + (a & b));
```

#### ii) Bitwise OR operator (|):  
It takes two numbers as operands and does OR on every bit of two numbers. The result of OR is 1 if any of the two bits is 1. Mind that the commutative property holds true here.
That is,<br>
              1 | 1 = 1<br>
              1 | 0 = 1<br>
              0 | 0 = 0 

#### iii) Bitwise NOT operator (~): 
It takes one number and inverts all bits of it.
    That is,<br>
              ~1 = 0<br>
              ~0 = 1           

#### iv) Bitwise XOR  operator (^):  
It takes two numbers as operands and does XOR on every bit of two numbers. The result of XOR is 1 if the two bits are different. Mind that the commutative property holds true here.That is,<br>
              1 XOR 1 = 0. <br>
              1 XOR 0 = 1. <br>
              0 ^ 0 = 0 
              
#### v) Left shift operator (<<): 
It takes two numbers, the left shift operator shifts the bits of the first operand, the second operand decides the number of places to shift.

#### vi) Right shift operator (>>): 
It takes two numbers; the right shift operator shifts the bits of the first operand, the second operand decides the number of places to shift.

NOTE: The left shift and right shift operators should not be used for negative numbers. If any of the operands is a negative number, it results in undefined behaviour. For example results of both -1 << 1 and 1 << -1 is undefined. Also, if the number is shifted more than the integer’s size, the behaviour is undefined. For example, 1 << 33 is undefined if integers are stored using 32 bits.

#### vii) Unsigned Right shift operator ( >>>): 
This operator is used to shift the bits of the number to the right and fills 0 in the void spaces that are left as a result. The leftmost bit is set to be 0.
<hr>

### Ternary Operator
Java Ternary operator is also known as the conditional operator: This operator is the only conditional operator in java that takes three operands. We can use ternary operator in place of if-else statement or even switch statement. The syntax of the ternary operator is shown below:
```java
variable = expression1 ? expression2 : expression3

// Example:
int a = 50;
      int b = 100;
      int minimum;

      // Printing the value of a and b
      System.out.println(“First Number = “ + a);
      System.out.println(“Second Number = “ + b);
     
      // Find the minimum number 
      minimum = (a < b) ? a : b;
      
     // Printing the minimum number
     System.out.println(“Minimum Number = “ + minimum);
 ```
Here, if expression1 is true then expression2 is evaluated, else expression3 is evaluated.

[Back to Top](README.md#java)

</details>

## Instance of operator
The instanceof operator in java is used to compare an object to a specified type. We can use it to check if an object is an instance of a class, an instance of a subclass, or an instance of a class that implements a particular interface. The instanceof operator is either returned true or false. 

<details>
Example: 

```java
public class InstanceOfExample {
   public static void main(String args[]) {
      // Creating the objects of parent
      // and the child class
      ParentClass obj1 = new ParentClass();  
      ChildClass obj2 = new ChildClass();

      // Comparing the object to a specified type
      System.out.println("obj1 is instance of ParentClass = " + (obj1 instanceof ParentClass));
      System.out.println("obj1 is instance of ChildClass = " +  (obj1 instanceof ChildClass));
      System.out.println("obj1 is instance of MyInterface = " + (obj1 instanceof MyInterface));
      System.out.println("obj2 is instance of ParentClass = " + (obj2 instanceof ParentClass));
      System.out.println("obj2 is instance of ChildClass = " +  (obj2 instanceof ChildClass));
      System.out.println("obj2 is instance of MyInterface = " + (obj2 instanceof MyInterface));
  }
}

// Creating parent class
class ParentClass {
}

// Creating an interface
interface MyInterface {
}

// Creating child class
class ChildClass extends ParentClass implements MyInterface {
}

cmd>
obj1 is instance of ParentClass = true
obj1 is instance of ChildClass = false
obj1 is instance of MyInterface = false
obj2 is instance of ParentClass = true
obj2 is instance of ChildClass = true
obj2 is instance of MyInterface = true
```
Note: In the case of null value, it returns false because null is not an instance of anything. Let’s look at an example:
Example:  

```java
public class InstanceOfOperator {
   public static void main(String args[]) {
   
      // Creating an object of class
      // and assigning it with null.
      InstanceOfOperator obj = null;

      // Returns false
      System.out.println(obj instanceof InstanceOfOperator);
  }
}

Output:
false
```
</details>

[Back to Top](README.md#java)

[Back to Top](README.md#java)
<hr>

## Control Statements in Java
A Control Statement is used to control the flow of the execution of a program. In the Java programming language, we can control the flow of execution of a program based on some conditions. In Java, we can put control statements in the following three categories. These are selection statements, iteration statements, and jump statements. 

 
### Selection Statements:
The selection statements in java allow your program to choose a different path of execution based on certain conditions. Java selection statements provide different types of selection statements such as:

<details>
<summary>Read More - if, Switch</summary>

#### i) if statement: 
The if statement in Java is a decision-making statement that determines whether or not a certain statement or block of statements will be executed. The block of statements is executed if a certain condition evaluates to true; otherwise, it is not.
```java
if(condition) {
   // Code to be executed if the 
   // Condition is true
}
```

#### ii) if-else statement: 
Java if statement is used to decide whether a certain statement or block of statements will be executed or not. If a certain condition is true, then the block of statements is executed, otherwise not. But if you want to do something else if your condition is false, then you should use else statements. One can use an else statement with if statement to execute the block of statements when the condition is false.

```java
if(condition) {
	// execute this block if the
	// condition is true
}
else {
	// execute this block if the
	// condition is false
}
```
#### iii) nested if-statement: 
nested if-statement means if statement inside the another if statement. In nested-if statements, the inner if block statements execute only if the outer if block statement is true. Let’s look at the example to understand better.

```java
if(condition1) {
	// execute this block if condition1 is true
	
	if(condition2) {
		// execute this block if condition2 is true
	}
}

```

#### iv) if-else-if ladder: 
When we need to deal with different conditions in Java, we use the if-else-if ladder. From the top-down, the if sentences are executed. The assumption connected with that it is executed as soon as one of the conditions governing the if is true, and the remainder of the ladder is bypassed. The final else sentence will be executed if none of the conditions are valid. The final else sentence serves as a default condition, meaning that it is executed if all other conditional checks fail. There will be no steps taken if there is no final else and all other circumstances are incorrect.

```java
if(condition1) {
    // If condition1 is true, this part of the code will be executed
}
else if (condition2) {
    // If condition2 is true, this part of the code will be executed
} 
else if (condition3) {
    // If condition3 is true, this part of the code will be executed
}
...
else {
    // If all the above conditions are false, this part of the code will be executed
}

```

#### v) Switch Statement: 
A multiway branch statement in Java is the switch statement. It can be used to run a single statement based on a set of conditions. It will deal with data types such as byte, short, char, and int. The value of the expression is compared to one of the literal values in the case statement in the Java switch statement. If there is a match, the code sequence that follows the case statement is executed. The default statement is used if none of the constants fit the value of the expression. It's not necessary to use the default sentence. The declaration sequence is terminated with the split statement within the turn event.

```java
switch (expression)  {
    case constant1:
        // Code to be executed 
        // If expression is equal to constant1
        break;
    case constant2:
        // Code to be executed 
        // If expression is equal to constant2
        break;
        ...
    default:
        // Code to be executed 
        // If the expression doesn't match any constant
}
```
</details>

### Iteration Statements
Java iteration statements are used to repeat the set of statements until the condition of the termination is true. There are three types of iteration statements in java.

 <details>
<summary>While, Do while and For Loop</summary>

#### i) while loop: 
Java while loop is used to repeat a statement or block of the statement until a condition is true. We can use a while loop if the number of iterations is not fixed. The condition of a while loop is any boolean expression. The loop will run till the condition is true, if the condition becomes false the control goes to the next statement immediately following the loop.

```java
Syntax: 
initialization;
while (condition) {
    // statements
    update_expression;
}

Code:
// Initialization
       int i = 1;
        // While loop run till the 
        // condition is true
        while(i < = 10) {
             System.out.print(i + “ “);
             // Increment the value by 1.
             i++;
        }
```
#### ii) do-while loop: 
Java do-while loop is also used to repeat a statement until a condition is true. Sometimes in our program we want to execute the body of the loop at least once, even if the conditional expression is false, in other words, there are times when you would like to test the conditional expression at the end of the loop rather than the beginning. Then we should go for a do-while loop in java. It executes the body loop at least once because the conditional expression is checking at the end. Let’s look at the example to understand this.

```java
Syntax:
initialization;
do {
    // statements
    // update_expression;
}
while (condition);
```
#### iii) for loop: 
The for loop in java is used to iterate a part of the program several times. It consumes the initialization, condition checking, and increment/decrement a value in one line. If the number of iterations is fixed then it is recommended you use Java for loop.

Syntax:<br>
for(initialization condition; testing condition; increment/decrement) {
    // statements
}

```java
/ for loop to print the value 
      // from 1 to 10
      for(int i = 1; i <= 10; i++)
          System.out.print(i + “ “);
```
#### Java Enhanced for loop:  (foreach)
Java Enhanced for loop provides a simpler way to iterate through the elements of a collection or array. It is used when we need to sequentially iterate through elements without knowing the index of the currently processing element.

```java
public class JavaEnhancedForLoop {
   public static void main(String arg[]) {
   
      // array of string
      String array[] = {“Coding”, “Ninjas”, “Welcomes”, “You”};
      
      // Enhanced for loop
      for(String x : array) {
         System.out.println(x);
      }
   }
}
```
</details>

### Jump Statements
 In Java, we use jump statements to transfer the control of the program to other parts of the program. There are various types of jump statements in java.

 
<details>

#### i) break statement: 
The loops are terminated using the Java break expression. It can be used within a loop. When a break statement is found within a loop, the loop is ended and control is passed to the next statement after the loop. There are three uses for the Java break statement.

- It can be used to terminate a statement sequence in the switch statement.
- It can be used to terminate a loop.
- It can be used as a civilized form of goto statement for performing a labeled break.
 
Syntax:<br>
break;
 
```java
Example:
public class JavaBreakStatement {
 	public static void main(String args[]) {
     	for(int i = 1; i <= 10; i++) {
         	// terminate the loop if i is 5.
         	if(i == 5)
            	break;
         	System.out.print(i + “ “);
     	}
  	}
}

Output:
1 2 3 4
```
#### ii) labeled break statement: 
Java labeled break statement can be used as a civilized form of a goto statement. Java doesn’t provide a goto statement. It utilizes a label, which is a code block that must enclose the break statement but does not have to do so immediately. To exit a series of nested blocks, we can use labeled break statements.

Example:
```java
public class JavaLabeledBreak {
	public static void main(String args[]) {
		boolean b = true;
		// first label
		first: {
			// second label
			second: {
				// third label
				third: {
					System.out.println(“Before the break statement”);
					// break will take the control out 
					// of the second label
					if(b)
						break second;
					System.out.println(“This would not be execute”);
				}
				System.out.println(“This would not be execute”);
			}
				System.out.println(“This is after the second block”);
		}
	}
}
 
Output:
Before the break statement
This is after the second block 
```

#### iii) continue statement: 
Java continue statement is used to skip the current iteration of the loop. We can use continue statements in all types of loops. In the case of for loop, the continue statement forces the control to jump immediately to the update statement. In case of while and do-while loop the control immediately jumps to the boolean expression.
 
Syntax:<br>
continue;

Example:
```java
public class JavaContinueStatement {
    public static void main(String args[]) {
        for(int i = 1; i <= 5; i++) {
            // using continue statement
            // skip the value when i is 3
            if(i == 3)
                continue;
             
            // Printing the value
            System.out.print(i + “ “);
        }
    }
}

Output:
1 2 4 5
```

#### iv) Continue Statement with nested loop: 
It continues the inner loop only when you use the continue statement inside the inner loop.

Example:
```java
public class JavaContinueNested {
    public static void main(String args[]) {
        // outer for loop
        for(int i = 1; i <= 3; i++) {
            // inner for loop
            for(int j = 1; j <= 3; j++) {
                // continue statement inside the inner loop
                // to skip the current iteration when
                // i == 2 and j == 2
                
                if(i == 2 && j == 2) {
                    continue;
                } 
                System.out.println(i + “ “ + j);
            }
        }
    }
}   
 
Output:
1 1
1 2
1 3
2 1
2 3
3 1
3 2
3 3
```
#### v) continue statement with labeled for loop: 
Like the java break statement, the continue statement may also specify a label to describe which enclosing loop to continue. Let’s look at the example to understand better.

Example:
```java
public class JavaLabeledContinue {
    public static void main(String args[]) {
        aa:
        for(int i = 1; i <= 3; i++) {
            bb:
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    // using continue statement with label
                        continue aa;
                }
                System.out.println(i + “ “ + j);
            }
        }
    }
}

Output:
1 1
1 2
1 3
2 1
2 3
3 1
3 2
3 3
```

#### vi) return statement: 
Java return statement is used to explicitly return from the method. It transfers the program control back to the caller method. The return statement immediately terminates the method in which it is executed. We need to declare a method return type in its method declaration. Any method declared void doesn’t return any value. A compile-time error can occur if you attempt to return a value from a method that is declared void.

Syntax:

return;

</details>

[Back to Top](README.md#java)

## Function in Java
A function is a collection of statements or a block of code that is used to perform some specific task. It is used to reuse the code without retyping the code. We can write the function once and use it many times. We don’t need to write the code again and again. The function is executed only when we call it. In Java, a function is also called a method. 

<b>Method Declaration in Java:</b> The method declaration in java provides information about the method attributes such as method name, method return type, method visibility, method parameters, and the method body. Let’s look at the example of the method declaration

```java
public int max(int x, int y) {
    // Method body
}
```
Here,
- public: the public is a modifier.
- int: int is a return type of method that means it returns an int value.
- max: max is the name of the method.
- int a, int b: int a, and int b is the list of parameters<br>

![Screenshot_2025_0215_143528](../../Pictures/Screenshots/Screenshot_2025_0215_143528.png)

<details>
<summary>Example and in detailed about method </summary>

### Example of Method Declaration: 
In this example, we declare a method that accepts two parameters and returns the maximum of two numbers. Let’s look at the example:

```java
public int max(int x, int y) {
 
    if(x > y)
       return x;
    else
        return y;
}
 ```

### Method Calling in Java: 
Once we declare a method, we need to call this method to perform some specific task. When we call a method,  the program controls transfer to the called method. Let’s look at the example.

```java
public class Example {
    // Function to return a maximum of two numbers
    public static int max(int x, int y) {
 
    if(x > y)
       return x;
    else
        return y;
    }
 
    // Driver Method
    public static void main(String arg[]) {
       int a = 10;
       int b = 20;
  
       // Method Calling
       int maximum = max(a, b);
       System.out.println(maximum);
    }
}
 ``` 
```java
Output:
20
```
![Screenshot_2025_0215_143548](_res/Screenshot_2025_0215_143548.png)

Consider the following code where there is a function called findsum which calculates and returns the sum of two numbers.

```java
class Solution {
    
    public static int findSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    public static void main(String args[]) {
        
        int a = 10;
        int b = 20;
        int c = findSum(a, b);
        System.out.println(c);
            
    }
}
```

The function being called is called <b> callee</b>(here it is findsum function) and the function which calls the callee is called the <b>caller</b> (here main function is the caller) . When a function is called, programme control goes to the entry point of the function. Entry point is where the function is defined. So focus now shifts to callee and the caller function goes in paused state. 

For Example: In the above code entry point of the function <b>findSum()</b> is at line number 3. So when at line number 9 the function call occurs the control goes to line number 3, then after the statements in the function <b>findSum()</b> are executed the program control comes back to line number 9.

 <b>Why do we need function?</b>

- Reusability:  Once a function is defined, it can be used repeatedly. You can call the function as many times as needed, which saves work. Consider that you are required to find out the area of the circle. Now either you can apply the formula every time to get the circle area or make a function to find the area of the circle and invoke the function whenever needed.

- Neat code: A     code created with a function is easy to read and dry run. You don’t need to repeatedly type the same statements; instead, you can invoke the function whenever needed.

- Modularisation: Functions help in modularizing code. Modularisation means divides the code into small modules, each performing a specific task. Functions allow in doing so as they are the program’s tiny fragments designed to perform the specified task.

- Easy Debugging: It is easy to find and correct the error in function compared to raw code without function where you must correct the error everywhere the specific task of the function is performed.

</details>

## Types of Methods in Java
In Java, there are two types of methods:

- Predefined Method
- User-defined Method
 
### Predefined Method
Predefined methods are the methods that are already defined in the java class libraries. It's also known as the built-in method or the standard library method. At any point in our program, we can use predefined methods explicitly.Some predefined methods in java are: sqrt(), max(), min(), round(), etc. These are defined inside the Math class. Some predefined methods of String class are: length(), toUpperCase(), toLowerCase(), equals(), etc. Let’s look at some examples using predefined methods.

 <details>
<summary>Read More</summary>

Example 1: Find the maximum of two numbers using the built-in method.

```java
public class MaxOfTwoNumbers {
	public static void main(String args[]) {
	
		// Maximum of two numbers using Math.max()
		int maximum = Math.max(100, 30);
		System.out.println(maximum);
	}
}
 

Output:<b>
100
```

Example 2: Find the minimum of two numbers using the built-in method.

```java
public class MinOfTwoNumbers {
	public static void main(String args[]) {
	
		// Minimum of two numbers using Math.min()
		int minimum = Math.min(100, 30);
		System.out.println(minimum);
	}
}
 
Output:
30
 ```

Example 3: Find the square root of a number using the built-in method.
```java
public class SqrtOfNumber {
	public static void main(String args[]) {
	
		// Finding the square root of a number using Math.sqrt()
		double sqrt = Math.sqrt(144);
		System.out.println(sqrt);
	}
}
Output:
12.0
 ```
Example 4: Find string length using the built-in method.

```java
public class FindStringLength {
	public static void main(String args[]) {
	
		String str = "Coding Ninjas";
		
		// Printing string length using length()
		System.out.println(str.length());               
	}
}
 
Output:
13
 ```
Example 5: Convert the string into the upper case using the built-in method.

```java
public class UpperCaseString {
	public static void main(String args[]) {
	
		String str = "Coding Ninjas";
		
		// Printing upper case string using toUpperCase()
		System.out.println(str.toUpperCase());               
	}
}
 
Output:
CODING NINJAS
```
</details>

### User-defined Method
The method written by the user or programmer is called the user-defined method. We can modify these methods based on our requirements. Let’s discuss the user-defined method with all four combinations of arguments and return type.

<details>
<summary>Read More</summary>

#### Types of user defined methods
1. No argument(s) passed and no return value:

When a function has no arguments, it doesn’t receive any data from the calling method. Similarly, when it doesn’t return a value, the calling method doesn’t receive any data from the called method.

Syntax:
```java
Function declaration : void function();
Function call : function();
Function definition : void function()
                      {
                          Statements;
                      }
``` 

Example: In this example, we have created a method checkEvenOdd() and we don’t pass any parameters to it. We simply write the code to check whether a number is even or odd as the body of the function. If the number is even, we simply print “Even Number”, else we print “Odd Number” and doesn’t return any value.

```java
public class Solution {
	
	// Function to check a number
	// is even or odd
	public static void checkEvenOdd() {
		
		// Number to be checked
		int num = 24;
		
		if(num % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
	
	public static void main(String args[]) {
		// Method Calling
		checkEvenOdd();
	}
		
}

Output:
Even Number
 ```
 
2. No arguments passed but return a value:

There could be a requirement in our program where we may need to design a method that takes no argument(s) but returns a value to the calling method. 

Syntax:
```java
Function declaration : int function();
Function call : function();
Function definition : int function()
                      {
                          Statements;
                          return x;
                      }
```

Example:
```java
public class Solution {
	
	// Function to return the
	// sum of two numbers
	public static int sumOfTwoNumbers() {
		
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		return sum;
	}
	
	public static void main(String args[]) {
		
		// No arguments passed in the method
		int sum = sumOfTwoNumbers();
		System.out.println(sum);
	}
		
}
 
Output:
30
```
3. Arguments passed but don't return a value:

In this example, we have created a method to check whether a number is even or odd. This method doesn’t return any value but when we call this function we need to pass argument(s) to it.


Syntax:
```java
Function declaration : int function(int x);
Function call : function(x);
Function definition : int function(x)
                      {
                          Statements;  
                      }
 ```
 
Example:
```java
public class Solution {
	
	// Method to check a number is even or odd
	public static void findEvenodd(int num) {
		
		if(num % 2 == 0) {
			System.out.println("Even Number");
		}

		else {
			System.out.println("Odd Number");
		}
	}
	
	// Driver Method
	public static void main(String args[]) {

		int num = 24;
		
		// argument passed in the method
		findEvenodd(num);
	}
}	
 
Output:
Even Number
```

4. Arguments passed and do return a value:

In this example, we have created a method that returns the sum of the two numbers and accepts argument(s).

Syntax:
```java
Function declaration : int function(int x);
Function call : function(x);
Function definition : int function(x)
                      {
                          Statements;
                          return x;
                      }
 ```
 
Example:
```java
public class Solution {
	
	// Function to return the
	// sum of two numbers
	public static int sumOfTwoNumbers(int num1, int num2) {
	
		int sum = num1 + num2;
		
		// Return sum
		return sum;
	}
	
	public static void main(String args[]) {
		
		int a = 10;
		int b = 20;
		
		// Method calling with arguments
		System.out.println(sumOfTwoNumbers(a, b));
	}
		
}

Output:
30
```
</details>

### Passing Parameters to Methods
 - Pass by value in java: 

The formal parameters are allocated to a new memory when the parameters are passed to a function using the pass-by-value method. The value of these parameters is the same as the value of the actual parameters. Changes in formal parameters would not represent changes in individual parameters because they are assigned to the new memory.

<details>
<summary>Example</summary>

```java
public class Solution {
	
	public static void increase(int x, int y) {
		x++;
		y = y + 2;
		
		// x and y are formal parameters
		System.out.println(x + ":" + y);
	}
	
	public static void main(String args[]) {
		
		int a = 20;
		int b = 10;
		increase(a, b);
		
		// a and b are actual parameters
		System.out.println(a + ":" + b);
			
	}
}
 
Output:
21:12
20:10
 ```
 
Changes in x and y values are not reflected in a and b in the above code because x and y are formal parameters and are local to function increment; thus, any changes in their values here will not impact variables a and b within the key function.

</details>

### Method Overloading
 
Method overloading in Java is when a class has multiple methods of the same name but different parameters. The main advantage of the method overloading is to increase the readability of the program. Method overloading is related to compile-time polymorphism. You will learn more about this in OOPs as well.


Ways to overload a method: There are two ways to overload a method in java

- By changing the number of arguments.
- By changing the data type.
 
<details>

1. Method overloading with changing the number of arguments.

In this example, we have created two methods, the first add() method performs the addition of the two numbers, and the second add() method performs the addition of the three numbers. Let’s look at the example

```java
public class Solution {
	
	// Function with two parameters
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// Function with three parameters
	public static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static void main(String args[]) {
		
		// Method calling by passing arguments
		int sumOfTwoNumbers = Solution.add(10, 20);
		int sumOfThreeNumbers = Solution.add(10, 20, 30);
		
		System.out.println(sumOfTwoNumbers);
		System.out.println(sumOfThreeNumbers);
	}
		
}
 

Output:
30
60
```

2. Method overloading with changing the data type of arguments.
In this example, we have created two add() methods with different data types. The first add() method takes two integer arguments and the second add() takes two double arguments. 

```java
public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// Function with two double parameters
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
```

</details>


[Back to Top](README.md#java)

## Reference
- Coding Ninja
- SDET-QA
- College Notes

## Author 

• Vaibhav R. Kale - QA Tester<br>
[Code360](https://www.naukri.com/code360/profile/CoderVK) &nbsp; &nbsp;
[LinkedIn](https://www.linkedin.com/in/vaibhav-kale)


