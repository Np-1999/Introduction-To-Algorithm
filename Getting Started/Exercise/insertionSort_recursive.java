import java.util.Arrays;

public class insertionSort_recursive {
    public static void sort(int arr[],int index) {
        if(index < arr.length){
            int i = index-1;
            int key = arr[index];
            while( i>= 0 && key < arr[i] ){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
            sort(arr, index+1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {31,41,59,26,41,58};
        sort(arr,1);
        System.out.println(Arrays.toString(arr));
    }
}