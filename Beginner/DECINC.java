PROBLEM:

Decrement OR Increment Problem Code: DECINC

Write a program to obtain a number N and increment its value by 1 if the number is divisible by 4 otherwise decrement its value by 1.

Input:
First line will contain a number N.
Output:
Output a single line, the new value of the number.

Constraints
0≤N≤1000
Sample Input:
5
Sample Output:
4
EXPLANATION:
Since 5 is not divisible by 4 hence, its value is decreased by 1.


SOLUTION:


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    
		    Scanner sc=new Scanner(System.in);
		    
		        int n=sc.nextInt();
		        if(n>=0 && n<=1000){
		        if(n%4==0)
		        {
		            System.out.println(n+1);
		        }
		        else{
		            System.out.println(n-1);
		    }
		        }
		
		}catch(Exception e) {return;
		}
	}
}
