import java.util.Stack;

public class reverseStack {
    public static void reverse(Stack <Integer> q) {
        if(q.size()==1){
            return;
        }
        int val = q.pop();
        reverse(q);
        insert(q,val);
    }
    public static void insert(Stack<Integer>q, int val) {
        if(q.empty()){
            q.push(val);
            return;
        }
        int value = q.pop();
        insert(q, val);
        q.push(value);
    }
    public static void main(String[] args) {
        Stack <Integer>q = new Stack<Integer>();
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        reverse(q);
        while(!q.empty())
            System.out.println(q.pop()); 
    }
}
