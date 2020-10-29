/*
Problem Statement: Generate all possible arrangements of balanced paranthesis for given number of open
brackets
For example :
Input : n=2
O/p: ()()
    (())
*/ 
public class balancedParanthesis {
    public static void solve(int open,int close, String op) {
        if(open == 0 && close == 0){
            System.out.println(op);
            return;
        }
        if( open == 0 ){
            String op1 = op+ ")";
            solve(open, --close, op1);
            return;
        }
        if(open < close){
            String op1 = op+"(";
            String op2 = op+")";
            solve(open-1, close, op1);
            solve(open, close-1, op2);
            return;
        }
        String op1 = op +"(";
        solve(--open, close, op1);        
    }
    public static void main(String[] args) {
        int n = 3;
        int open =n;
        int close =n;
        solve(open,close,"");    
    }
}
