/* Generate all possible powerset of given string */
public class subset {
    public static void solve(String q, String op) {
        if(q.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op + q.charAt(0);
        String op2 = op;
        q = q.substring(1); 
        solve(q, op1);
        solve(q,op2);
    }
    public static void main(String[] args) {
        String q = "aabcd";
        String op = "";
        solve(q,op);
    }
}
