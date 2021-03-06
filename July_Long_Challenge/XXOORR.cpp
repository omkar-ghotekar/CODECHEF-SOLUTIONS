PROBLEM:


XxOoRr Problem Code: XXOORR



Given an array A1,A2…AN, find the minimum number of operations (possibly zero) required to convert all integers in A to 0.

In one operation, you

choose a non-negative integer p (p≥0),
select at most K indices in the array A, and
for each selected index i, replace Ai with Ai⊕2p. Here, ⊕ denotes bitwise XOR.
Input
The first line contains an integer T - the number of test cases. Then T test cases follow.
The first line of each test case contains two integers N, K - the size of the array and the maximum number of elements you can select in an operation.
The second line of each test case contains N integers A1,A2…AN.
Output
For each test case, output the minimum number of operations to make all elements of the array 0.

Constraints
1≤T≤105
1≤N,K≤105
0≤Ai≤109
The sum of N over all test cases does not exceed 2⋅105
Subtasks
Subtask #1 (100 points): Original Constraints
Sample Input
1
3 2
3 6 10
Sample Output
5
Explanation
Here is one way to achieve [0,0,0] from [3,6,10] in 5 operations:

Choose p=0 and indices {1}. Now A becomes [2,6,10].
Choose p=1 and indices {1,2}. Now A becomes [0,4,10].
Choose p=1 and indices {3}. Now A becomes [0,4,8].
Choose p=2 and indices {2}. Now A becomes [0,0,8].
Choose p=3 and indices {3}. Now A becomes [0,0,0].
It can be shown that at least 5 operations are required.


  
  
SOLUTION:


#include <iostream>
#include<vector>
using namespace std;

int main() {
	
	
	int t;
	cin>>t;
	
	int ans;
	int n,k;
	
	
	while(t-->0)
	{
	    cin>>n>>k;
	    vector<int> a(n);
	    
	    for(int& i:a)
	    {
	        cin>>i;
	    }
	    
	    vector<int> nSetBit(31);
	    int count,term;
	    for(int bit=0;bit<=30;bit++)
	    {
	        count=0;
	        for(int& i:a)
	        {
	            if(i%2!=0)
	            {
	                count++;
	                
	                
	            }
	            i=i/2;
	        }
	    nSetBit[bit]=count;    
	    }
	    
	    ans=0;
	    for(int bit=0;bit<=30;bit++)
	    {
            if(nSetBit[bit]%k==0)
            {
                ans=ans+nSetBit[bit]/k;
            }
            else
            {
                ans=ans+nSetBit[bit]/k+1;
            }
	    }
	    cout << ans <<endl;
	    
	}
}
