import java.util.*;
public class maxHeap{
    public static int leftChild(int index){
        return 2*index + 1;
    }
    public static int rightChild(int index){
        return 2*index + 2;
    }
    public static void maxHeapify(int arr[],int index) {
        int leftC = leftChild(index);
        int rightC = rightChild(index);
        int largest = index;
        if( leftC < arr.length  && arr[leftC] > arr[index] ){
            largest = leftC;
        }
        if( rightC < arr.length && arr[rightC]> arr[largest]){
            largest = rightC;
        }
        if(largest != index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr,largest);
        }
    }
    public static void buildMaxHeap(int arr[]){
        int mid = arr.length/2;
        for(int i= mid ;i>=0;i--){
            maxHeapify(arr,i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {16,4,10,14,7,9,3,2,8,1};
        buildMaxHeap(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}