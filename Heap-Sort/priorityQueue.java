import java.util.ArrayList;
import java.util.Arrays;

public class priorityQueue{
    
    public  static void insert(ArrayList<Integer> arr, int a){
        arr.add(Integer.MIN_VALUE);
        increaseKey(arr, arr.size()-1, a);
    }
    public static  int extractMax(ArrayList<Integer> arr){
        int max =  arr.get(0);
        arr.remove(0);
        arr.add(0, arr.remove(arr.size()-1));
        maxHeapify(arr, 0);
        return max;
    }
    public static int leftChild(int index){
        return 2*index + 1;
    }
    public static int rightChild(int index) {
        return 2*index + 2;
    }
    public static int parentNode(int index){
        return (int)((index-1)/2);
    }
    public static void maxHeapify(ArrayList<Integer> arr, int index){
        int leftChild = leftChild(index);
        int rightChild = rightChild(index);
        int largest = index;
        if ( leftChild < arr.size() && arr.get(leftChild) > arr.get(largest)){
            largest = leftChild; 
        }
        if( rightChild < arr.size() && arr.get(rightChild) > arr.get(largest)){
            largest = rightChild;
        }
        if(largest!=index){
            int temp = arr.remove(largest);
            arr.add(largest,arr.get(index)); 
            arr.remove(index); 
            arr.add(index, temp); 
            maxHeapify(arr, largest);
        }

    }
    public static void increaseKey(ArrayList<Integer>arr, int index, int key ){
        if (key < arr.get(index)){
            System.out.println("Error key is less than current value of "+index+" element");
        }
        else{
            arr.remove(index);
            arr.add(index,key);
            int root = parentNode(index);
            
            while ( root >= 0 && arr.get(root) < arr.get(index)){
                
                int temp = arr.get(index);
                arr.remove(index);
                arr.add(index,arr.get(root));
                arr.remove(root);
                arr.add(root, temp);
                index = root;
                root = parentNode(index);
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(16,4,10,14,8,9,3,2,8,1));
        System.out.println("creating max heap");
        for(int i=(arr.size())/2;i>=0;i--){
            maxHeapify(arr, i);
        }
        System.out.println("After max heapify" + arr);
        System.out.println("Increasing key at index 3 to 20");
        increaseKey(arr, 0, 20);
        System.out.println("After increasing key" + arr);
        insert(arr, 11);
        System.out.println("After adding 11 to queue " + arr);
        System.out.println("Extract max "+ extractMax(arr));
        System.out.println(arr);
    }
}