import java.util.*;
public class heapSort{
    public static int[] heapSortM(int arr[]) {
        buildMaxHeap(arr);
        int size = arr.length;
        for(int i = arr.length-1;i>=1;i--){
            exchange(arr,0,i);
            size = size-1;
            maxHeapify(arr,0,size);
        }
        return arr;
    }
    public static void exchange(int arr[],int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp; 
    }
    public static int leftChild(int index){
        return 2*index + 1;
    }
    public static int rightChild(int index){
        return 2*index + 2;
    }
    public static void maxHeapify(int arr[],int index,int size) {
        int leftC = leftChild(index);
        int rightC = rightChild(index);
        int largest = index;
        if( leftC < size  && arr[leftC] > arr[index] ){
            largest = leftC;
        }
        if( rightC < size && arr[rightC]> arr[largest]){
            largest = rightC;
        }
        if(largest != index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr,largest,size);
        }
    }
    public static void buildMaxHeap(int arr[]){
        int mid = arr.length/2;
        for(int i= mid ;i>=0;i--){
            maxHeapify(arr,i,arr.length);
        }
    }
    public static void main(String[] args) {
        int arr[] = {16,4,10,14,7,9,3,2,8,1};
        System.out.println(Arrays.toString(heapSortM(arr)));
    }
}