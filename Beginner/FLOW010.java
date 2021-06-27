PROBLEM:

Id and Ship Problem Code: FLOW010


Write a program that takes in a letterclass ID of a ship and display the equivalent string class description of the given ID. Use the table below.

Class ID	Ship Class
B or b	BattleShip
C or c	Cruiser
D or d	Destroyer
F or f	Frigate
Input
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains a character.

Output
For each test case, display the Ship Class depending on ID, in a new line.

Constraints
1 ≤ T ≤ 1000
Example
Input

3 
B
c
D

Output
BattleShip
Cruiser
Destroyer



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
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    char ch=sc.next().charAt(0);
		    switch(ch)
		    {
		        case 'B':
		            case 'b':
		                System.out.println("BattleShip");
		                break;
		          
		        case 'C':
		            case 'c':
		                System.out.println("Cruiser");
		                break;
		                
		                
		       case 'D':
		           case 'd':
		               System.out.println("Destroyer");
		               break;
		               
		               
		      case 'F':
		          case 'f':
		              System.out.println("Frigate");
		              break;
		    }
		}
		
	}
}
