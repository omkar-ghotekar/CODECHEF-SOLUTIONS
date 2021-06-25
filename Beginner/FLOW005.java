PROBLEM:


Smallest Numbers of Notes Problem Code: FLOW005


Consider a currency system in which there are notes of six denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.
If the sum of Rs. N is input, write a program to computer smallest number of notes that will combine to give Rs. N.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.

Output
For each test case, display the smallest number of notes that will combine to give N, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000
Example
Input
3 
1200
500
242

Output
12
5
7


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
		    int[] denomination={1, 2, 5, 10, 50, 100};
		    while(t-->0)
		    {
		        int total=sc.nextInt();
		        int count=0;
		        
		        for(int i=5;i>=0;i--)
		        {
		            while(total>=denomination[i])
		            {
		                total=total-denomination[i];
		                count++;
		            }
		            if(total==0)
		            {
		                break;
		            }
		        }
		        
		       System.out.println(count);
		        
		    }
		    
		} catch(Exception e) {return;
		}
	}
}
