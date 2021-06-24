PROBLEM:

Chef has just started Programming, he is in first year of Engineering. Chef is reading about Relational Operators.
Relational Operators are operators which check relatioship between two values. Given two numerical values A and B you need to help chef in finding the relationship between them that is,
First one is greater than second or,
First one is less than second or,
First and second one are equal.
 

Input
First line contains an integer T, which denotes the number of testcases. Each of the T lines contain two integers A and B.

Output
For each line of input produce one line of output. This line contains any one of the relational operators
'<' , '>' , '='.

Constraints
1 ≤ T ≤ 10000
1 ≤ A, B ≤ 1000000001
Example
Input:
3
10 20
20 10
10 10

Output:
<
>
=


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
		    int t=sc.nextInt();
		    
		    while(t-->0)
		    {
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        
		        if(a>b)
		        {
		            System.out.println(">");
		        }
		        else if(a<b)
		        {
		            System.out.println("<");
		        }
		        else{
		            System.out.println("=");
		        }
		    }
		    
		} catch(Exception e) {return;
		}
	}
}
