public class permutationWithCase {
    public static void solve(String ip, String op) {
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        if( Character.isDigit(ip.charAt(0))){
            String op1 =op+ip.charAt(0);
            ip = ip.substring(1);
            solve(ip, op1);
        }
        else{
            String op1 = op + Character.toLowerCase(ip.charAt(0));
            String op2 = op + Character.toUpperCase(ip.charAt(0));
            ip = ip.substring(1);
            solve(ip, op1);
            solve(ip, op2);
        }
    }
    public static void main(String[] args) {
        String q = "a1B1";
        solve(q,"");
    }
}
