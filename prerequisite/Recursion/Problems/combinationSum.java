// https://practice.geeksforgeeks.org/problems/combination-sum-1587115620/1/?category[]=Recursion&company[]=Amazon&difficulty[]=1&page=1&query=category[]Recursioncompany[]Amazondifficulty[]1page1#
import java.util.*;
class combinationSum
{
    static void solve(int index, int sum, int B,ArrayList<Integer> A,final ArrayList<Integer> n,ArrayList<ArrayList<Integer>> Ans){
         
         if(sum == B){
            Ans.add(n);
            return;
        }
        for(int i=index;i<A.size();i++){
            ArrayList<Integer> shallowCp = new ArrayList<Integer>(n);
            if((sum + A.get(i)) <= B){
                shallowCp.add(A.get(i));
                solve(i,sum+A.get(i),B,A,shallowCp,Ans);
            }
        }
        
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // Code to remove duplicates
        Set<Integer> set = new LinkedHashSet<>(); 
  
        // Add the elements to set 
        set.addAll(A); 
  
        // Clear the list 
        A.clear(); 
  
        // add the elements of set 
        // with no duplicates to the list 
        A.addAll(set); 
        // Sort ArrayList

        Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(A.get(i));
            ArrayList<ArrayList<Integer>> Ans = new ArrayList<>();
            solve(i,A.get(i),B,A,a,Ans);
            ans.addAll(Ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> q = new ArrayList<Integer>();
        q.add(2);
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(combinationSum(q,16));
    }
}