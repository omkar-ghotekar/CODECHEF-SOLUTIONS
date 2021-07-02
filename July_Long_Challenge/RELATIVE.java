PROBLEM:


Relativity Problem Code: RELATIVE


In Chefland, the speed of light is c m/s, and acceleration due to gravity is g m/s2.

Find the smallest height (in meters) from which Chef should jump such that during his journey down only under the effect of gravity and independent of any air resistance, he achieves the speed of light and verifies Einstein's theory of special relativity.

Assume he jumps at zero velocity and at any time, his velocity (v) and depth of descent (H) are related as
v2=2⋅g⋅H.
Input
The first line contains an integer T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, two integers g, c.
Output
For each test case, output in a single line the answer to the problem. We can show that under the constraints, the answer is an integer.

Constraints
1≤T≤5⋅103
1≤g≤10
1000≤c≤3000
2⋅g divides c2.
Subtasks
Subtask #1 (100 points): Original constraints

Sample Input
3
7 1400
5 1000
10 1000
Sample Output
140000
100000
50000
Explanation
Test Case 1: For Chef to achieve the speed of light, the minimum height required is c22⋅g = 1400⋅140014 = 140000 meters.

Test Case 3: For Chef to achieve the speed of light, the minimum height required is c22⋅g = 1000⋅100020 = 50000 meters.
  
  
  
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
		        int g=sc.nextInt();
		        int c=sc.nextInt();
		        
		        long h=(c*c)/(2*g);
		        
		        System.out.println(h);
		    }
		    
		} catch(Exception e) {return;
		}
	}
}
