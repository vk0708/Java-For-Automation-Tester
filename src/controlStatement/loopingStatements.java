package controlStatement;

public class loopingStatements {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 5 using a while loop.
		System.out.println("***while***");  
		 int i = 1; // Initialization
	        while (i <= 5) { // Condition
	            System.out.println("Number: " + i);
	            i++; // Increment
	        }
	        
	    //Print numbers from 1 to 5 using a do-while loop.  
	    System.out.println("***do-while***");   
	    do {
            System.out.println("Number: " + i);		//it print 6 only beacuse i value gets 6 on while statement
            i++; // Increment
        } while (i <= 5); // Condition
	    
	    //Print numbers from 1 to 5 using a for loop.
	    System.out.println("***for***"); 
	    for (int j = 1; j <= 5; j++) { // Initialization, Condition, Increment
            System.out.println("Number: " + j);
        }
	}

}

/*
--------
loopingStatements
-------------

loop  or iteration -  executing same set of statements multiple times.

1) while 
2) do while
3) for loop


Initilization
condition
incrementation


while(condition)
{
statements;
}



do
{
statements;
}while(condition);


for(initilization; condition ; inc/dec )
{
statements;
}


** which loop is prefered to use
-----
* If you know the number of iterations in advance, the for loop is often the most suitable. 
* If you want to execute the loop at least once, the do-while loop is appropriate. 
* If you are uncertain about the number of iterations and the loop termination is based on a condition, the while loop is a good choice.


Bike --> for
Riding a bike is often purposeful and determined by a fixed distance or destination. You usually know where you're going and how far you need to travel.

bus -- > do while
A bus typically follows a predefined route, but it always makes a stop at least once, even if nobody needs to get off at a particular stop.


flight ----> while
A flight takes off only if certain conditions are met (e.g., proper weather, clearances). Once it's airborne, it continues flying until the condition (destination reached) is met.

Jumping statements
----------
break
continue


control statements
-------
conditional ----> if   if--else   switch case
loops ----------> while    do-while   for
jump ------------> break  continue


for - enhanced for loop(for each loop)

this loop especially design for collections like   arrays, list, hashmap.....


Assignments
---------

1) Reverse a number (  %   / =   operators   )

input 1234
output 4321

video link: https://www.youtube.com/watch?v=m0lMpNIG6vU

2) Palindrome number ( conditional statements + looping)
input 121
after reversing 121
Video link: https://youtu.be/kNE3vq1g2e8?si=NWbZyCI-uoisVWQu

3) Count Number of Digits in a Number (looping)

Input : 423424
output : 6

Video Link: https://www.youtube.com/watch?v=CnFBzBMEdMg

4) count Number of Even and Odd digits in a Number
Input: 23456
Output : 3 even  2 odd

Video Link: https://www.youtube.com/watch?v=Ns4LoG56SZ4

5) Find sum of digits in a number

input : 1234
sum= 10 

Video Link: https://www.youtube.com/watch?v=ZLaBlxnmrxc
*/
 