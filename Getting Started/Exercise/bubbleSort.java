import java.util.Arrays;

public class bubbleSort {
    public static void sort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if( arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {31,41,59,26,41,58};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}