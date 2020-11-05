/*
Problem Statement: https://practice.geeksforgeeks.org/problems/print-pattern/0/?category[]=Recursion&difficulty[]=0&page=1&query=category[]Recursiondifficulty[]0page1#
*/ 
import java.util.*;
import java.lang.*;
import java.io.*;

public class pattern {
    public static void solve(int n, int ans, int flag){
        if(n == ans){
            System.out.print(n+" ");
            return;
        }
        if(n<= 0 ){
            System.out.print(n+" ");
            solve(n+5,ans, 1);
        }
        else if(flag == 1 ){
            System.out.print(n+" ");
            solve(n+5,ans, 1);
        }
        else{
            System.out.print(n+" ");
            solve(n-5,ans ,flag);
        }
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    int n = in.nextInt();
		    System.out.print(n+" ");
		    solve(n-5,n,0);
		    System.out.println();
		}
	}
}