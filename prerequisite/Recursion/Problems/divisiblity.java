/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/divisibility/0/?difficulty[]=1&page=1&category[]=Recursion&query=difficulty[]1page1category[]Recursion#
import java.util.*;
import java.lang.*;
import java.io.*;

class divisibility {
    public static long solve(int index,long curr,long k, int N,int arr[]){
        long ans =0;
        if(index>=arr.length)
            return ans;
        
        long next = lcm(curr,arr[index]);
        ans += (long)k/next;
        ans+=solve(index+1,curr,k,N,arr);
        ans-=solve(index+1,next,k,N,arr);
        return ans;
    }
    static long gcd(long a, long b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
     
    // method to return LCM of two numbers
    static long lcm(long a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
	public static void main (String[] args) {
		int test_cases, n;
		long k;
		Scanner in = new Scanner(System.in);
		test_cases = in.nextInt();
		for(int i=0;i<test_cases;i++){
		    n = in.nextInt();
		    int arr[] = new int[n];
		    for(int j=0;j<n;j++)
		        arr[j] = in.nextInt();
		    k = in.nextLong();
		    System.out.println(solve(0,1,k,n,arr));
		}
	}
}