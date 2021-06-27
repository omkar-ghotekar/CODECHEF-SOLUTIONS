PROBLEM:


Total Expenses Problem Code: FLOW009


While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 1000.
If the quantity and price per item are input, write a program to calculate the total expenses.

Input
The first line contains an integer T, total number of test cases. Then follow T lines, each line contains integers quantity and price.

Output
For each test case, output the total expenses while purchasing items, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ quantity,price ≤ 100000
Example
Input

3 
100 120
10 20
1200 20

Output

12000.000000
200.000000
21600.000000


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
		        int quantity=sc.nextInt();
		        int price=sc.nextInt();
		        
		        double expense=0;
		        expense=quantity*price;
		        if(quantity>1000)
		        {
		            
		            expense=expense-(expense*0.10);
		            System.out.println(expense);
		        }
		        else{
		            expense=quantity*price;
		            System.out.println(expense);
		        }
		    }
		    
		} catch(Exception e) {return;
		}
	}
}
