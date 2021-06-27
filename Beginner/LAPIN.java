PROBLEM:


Lapindromes Problem Code LAPIN


Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.

Input:
First line of input contains a single integer T, the number of test cases.
Each test is a single line containing a string S composed of only lowercase English alphabet.
Output:
For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.
Constraints:
1 ≤ T ≤ 100
2 ≤ |S| ≤ 1000, where |S| denotes the length of S
Example:
Input:
6
gaga
abcde
rotor
xyzxy
abbaab
ababc


Output:
YES
NO
YES
YES
NO
NO



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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0) {
		    String s = sc.next();
		    int mid = s.length() / 2;
		    String s1 = s.substring(0, mid);
		    String s2;
		    if (s.length() % 2 == 0) {
		        s2 = s.substring(mid, s.length());
		    } else {
		        s2 = s.substring(mid+1, s.length());
		    }
		    char ch1[] = s1.toCharArray();
		    char ch2[] = s2.toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    
		    if (Arrays.equals(ch1, ch2)) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
	}
}
