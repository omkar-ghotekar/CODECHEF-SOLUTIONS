PROBLEM:

Maximum Production Problem Code: EITA

Chefland has 7 days in a week. Chef is very conscious about his work done during the week.

There are two ways he can spend his energy during the week. The first way is to do x units of work every day and the second way is to do y (>x) units of work for the first d (<7) days and to do z (<x) units of work thereafter since he will get tired of working more in the initial few days.

Find the maximum amount of work he can do during the week if he is free to choose either of the two strategies.

Input
The first line contains an integer T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, four integers d, x, y, z.
Output
For each testcase, output in a single line the answer to the problem.

Constraints
1≤T≤5⋅103
1≤d<7
1≤z<x<y≤18
Subtasks
Subtask #1 (100 points): Original constraints

Sample Input
3
1 2 3 1
6 2 3 1
1 2 8 1
Sample Output
14
19
14
Explanation
Test Case 1: Using the first strategy, Chef does 2⋅7=14 units of work and using the second strategy Chef does 3⋅1+1⋅6=9 units of work. So the maximum amount of work that Chef can do is max(14,9)=14 units by using the first strategy.

Test Case 2: Using the first strategy, Chef does 2⋅7=14 units of work and using the second strategy Chef does 3⋅6+1⋅1=19 units of work. So the maximum amount of work that Chef can do is max(14,19)=19 units by using the second strategy.



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
		        int d=sc.nextInt();
		        int x=sc.nextInt();
		        int y=sc.nextInt();
		        int z=sc.nextInt();
		        
		        int first=x*7;
		        int second=(y*d)+((7-d)*z);
		        
		        int maximum=Math.max(first,second);
		        System.out.println(maximum);
		    }
		    
		} catch(Exception e) {return;
		}
	}
}
