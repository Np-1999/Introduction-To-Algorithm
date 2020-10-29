/*
Problem Statement: Generate all possible permutation for having space between 2 characters.
For example, abc will give output abc, ab c , a bc, a b c.
 */
public class permutationWithSpaces {
    public static void solve(String ip, String op) {
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op + String.valueOf(ip.charAt(0));
        String op2 = op + " " + String.valueOf(ip.charAt(0));
        ip = ip.substring(1);
        solve(ip, op1);
        solve(ip,op2);
    }
    public static void main(String[] args) {
        String q = "abc";
        String op = String.valueOf(q.charAt(0));
        q = q.substring(1);
        solve(q,op);
    }
}
