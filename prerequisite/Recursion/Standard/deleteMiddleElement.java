import java.util.Stack;

public class deleteMiddleElement {
    public static void solve(Stack <Integer> q, int k) {
        if(k==1){
            q.pop();
            return;
        }
        int val = q.pop();
        solve(q,k-1);
        q.push(val);
    }
    public static void main(String[] args) {
        Stack <Integer>q = new Stack<Integer>();
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        int k = (int) q.size()/2;
        solve(q,k); 
        while(!q.empty())
            System.out.println(q.pop());    
    }
}   
