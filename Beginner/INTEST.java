PROBLEM:

Enormous Input Test Problem Code: INTEST

The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast to handle problems branded with the enormous Input/Output warning. You are expected to be able to process at least 2.5MB of input data per second at runtime.

Input
The input begins with two positive integers n k (n, k<=107). The next n lines of input contain one positive integer ti, not greater than 109, each.

Output
Write a single integer to output, denoting how many integers ti are divisible by k.

Example
Input:
7 3
1
51
966369
7
9
999996
11

Output:
4


SOLUTION:

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.Scanner;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
	
	try{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        int t=sc.nextInt();
	        if(t%k==0)
	        {
	            count++;
	        }
	    }
	    System.out.println(count);
	    
	}
	catch(Exception e)
	{
	    return;
	}
	}
}