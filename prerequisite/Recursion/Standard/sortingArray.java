

import java.util.ArrayList;

//Induction is sort(n-1) and insert(n)

//Induction for insert  is if number is greater than arraylist index element then insert it after it or
//If it is less than first number insert it at location zero
public class sortingArray {
    public static void sort(int arr[], int index, ArrayList<Integer> sorted){
        if(index == arr.length){
            return;
        }
        insert(sorted,index,arr,index);
        sort(arr, index+1, sorted);
    }
    public static void insert(ArrayList<Integer> sorted, int index, int arr[],int arraylistIndex){
        if(sorted.isEmpty() || sorted.get(arraylistIndex-1)<=arr[index]){
            sorted.add(arraylistIndex,arr[index]);
            return;
        }
        else if(arr[index]<= sorted.get(0)){
            sorted.add(0, arr[index]);
            return;
        }
        insert(sorted, index, arr, arraylistIndex-1);
    }
    public static void main(String[] args) {
        int arr[] = {31,41,59,26,41,58};
        ArrayList <Integer> sorted = new ArrayList<Integer>();
        sort(arr,0,sorted);
        System.out.println(sorted);
    }
}