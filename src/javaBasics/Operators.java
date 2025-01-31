package javaBasics;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;

		int c=a+b;
		
		System.out.println("Sum is: "+c);
		
		/*
		 a,b are called operands 
		 + = operators
		 */
		
		
	}

}


/*---------
Operators
--------
operator is a symbol which will perform an operation.

int a=10;
int b=20;

int c=a+b;

a,b are called operands
+ = operators

Types of operators
----------------
1) Arithmetic operators   + - * / % 
2) Relational/comparison operators  >  >=  <  <=  !=  == 
3) Logical operators   &&   ||  !
4) Increment & Decrement operators  ++  --
5) Assignment   =   +=   -=   *= /=  %=
6) conditional/ternary operator  ?: 

Unary Operators: Means operators perform an action on a single operand
 		e.g ++  -- =   +=   -=   *= /=  %=  !
Binary operators: Means operators perform an action on a Two operand
		e.g. + - * / % >  >=  <  <=  !=  ==  &&   ||
ternary operator: Means operators perform an action on a Three operand
		e.g. ?:


x	y	x&&y	x||y	!x	!y
---------------------------------------------
true	true	true	true	false	false	
true	false	false	true		true
false	true	false	true	true
false	false	false	false

Assignment
----------
1) swapping of 2 numbers

Solution: Check ../Assignment/swapping2Num.java Package
*/