import java.util.HashSet;
import java.util.Set;

public class uniqueSubset {
    static Set <String> output = new HashSet<String>();
    public static void solve(String q, String op) {
        if(q.length()==0){
            output.add(op);
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
        System.out.println(output);
    }
}
