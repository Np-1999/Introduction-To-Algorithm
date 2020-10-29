/* Tower of Hanoi*/ 
public class toh {
    public static void solve(int n) {
        if(n==1){
            System.out.println("Moving plate 1 from source to destination");
            return;
        }
        System.out.println("Moving plate" + n + " from source to helper");
        solve(n-1);
        System.out.println("Moving plate" + n + " from helper to destination");       
    }
    public static void main(String[] args) {
        solve(10);
    }
}
