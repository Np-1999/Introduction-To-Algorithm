/*Problem Statement: Print all possible permutation with case change of a string
For eg: 
Ip: ab
Op: aB
ab
Ab
AB*/
public class permutationWithCaseChange {
    public static void solve(String ip, String op) {
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op + Character.toUpperCase(ip.charAt(0));
        String op2 = op +  ip.charAt(0);
        ip = ip.substring(1);
        solve(ip, op1);
        solve(ip, op2);
    }
    public static void main(String[] args) {
        String q = "abc";
        solve(q,"");
    }
}
