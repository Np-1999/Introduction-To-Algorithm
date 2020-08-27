import java.util.Arrays;

public class insertionSort_decreasing {
    public static void sort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]< key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; 
            
        }
        System.out.println(Arrays.toString(arr));        
        
    }
    public static void main(String[] args) {
        int arr[] = {31,41,59,26,41,58};
        sort(arr);

    }
}