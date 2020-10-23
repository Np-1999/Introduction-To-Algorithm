import java.util.Stack;

public class sortingStack {
    static Stack<Integer> a = new Stack<Integer>();
    public static void sort(Stack<Integer>q){
        if(q.empty()){
            return;
        }
        insert(q.pop());
        sort(q);
    }
    public static void insert(int temp){
        if(a.empty() || temp <= a.peek()){
            a.push(temp);
            return;
        }
        int val = a.pop();
        insert(temp);
        a.push(val);
    }
    public static void main(String[] args) {
        Stack <Integer>q = new Stack<Integer>();
        q.push(2);
        q.push(9);
        q.push(5);
        q.push(3);
        q.push(4);
        sort(q);
        while(!a.empty())
            System.out.println(a.pop());
    }
}
