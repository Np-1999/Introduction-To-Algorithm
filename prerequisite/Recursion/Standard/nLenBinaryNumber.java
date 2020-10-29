/*
Problem Statement: Generate binary number of length n, such that for every prefix number of one's are
equal to count of zero or greater than count of zero
For example: 
Input:
n=3
Output:
110
111
101
*/ 
public class nLenBinaryNumber {
    public static void solve(int ip,String op,int one, int zero) {
        if(ip==0){
            System.out.println(op);
            return;
        }
        if(one ==zero){
            String op1 = op + "1";
            solve(ip-1, op1, one+1, zero);
        }
        else{
            String op1 = op + "0";
            String op2 = op + "1";
            solve(ip-1, op1, one, zero+1);
            solve(ip-1, op2, one+1, zero+1);
        }
    }
    public static void main(String[] args) {
        int ip =5;
        solve(ip,"",0,0);
    }
}
