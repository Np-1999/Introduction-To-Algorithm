import java.util.Arrays;

public class quicksort {
    public static void quicksort_f(int arr[], int p, int r) {
        if ( p < r ){
            int q = partition(arr,p,r);
            quicksort_f(arr, p, q-1);
            quicksort_f(arr, q+1, r);
        }
        
    }
    public static int partition(int arr[], int p, int r) {
        int i = p-1;
        for(int j=p;j<r;j++){
            if(arr[j] <= arr[r]){
                i= i + 1;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {8,7,9,3,1,3,5,5,3};
        quicksort_f(arr, 0, arr.length-1); 
        System.out.println(Arrays.toString(arr));  
    }
}
