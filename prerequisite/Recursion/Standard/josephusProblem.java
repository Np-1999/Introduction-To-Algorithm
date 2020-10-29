/*
Famous problem of Josephus
*/ 
import java.util.Vector;

public class josephusProblem {
    public static void solve(Vector<Integer> people, int index, int k) {
        if(people.size()==1){
            System.out.println(people.get(0));
            return;
        }
        index = (index + k) % people.size();
        people.remove(index);
        solve(people, index, k);
    }
    public static void main(String[] args) {
        int n = 40;
        int k = 7;
        Vector<Integer> people = new Vector<Integer>();
        for(int i=1;i<=40;i++){
            people.add(i);
        }
        solve(people,0,k-1);

    }
}
