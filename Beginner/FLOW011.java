PROBLEM:

Gross Salary Problem Code: FLOW011

In a company an emplopyee is paid as under: If his basic salary is less than Rs. 1500, then HRA = 10% of base salary and DA = 90% of basic salary.
If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary. If the Employee's salary is input, write a program to find his gross salary.

NOTE: Gross Salary = Basic Salary + HRA + DA

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer salary.

Output
For each test case, output the gross salary of the employee in a new line. Your answer will be considered correct if the absolute error is less than 10-2.

Constraints
1 ≤ T ≤ 1000
1 ≤ salary ≤ 100000
Example
Input
3
1203
10042
1312

Output
2406.00
20383.16
2624



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
		        int salary=sc.nextInt();
		        double basic_sal=0;
		        if(salary<1500 && salary>=1)
		        {
		            basic_sal=salary+(0.10*salary)+(0.90*salary);
		            System.out.println(basic_sal);
		            
		        }
		        else{
		            basic_sal=salary+500+(.98*salary);
		            System.out.println(basic_sal);
		        }
		        
		    }
		    
		} catch(Exception e) {return;
		}
	}
}
