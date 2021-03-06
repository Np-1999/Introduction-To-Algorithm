import java.util.Arrays;
public class randomizedQuicksort {
    public static void randomizedQuicksort_f(int arr[], int p, int r) {
        if (p<r){
            int q = randomizedPartition(arr, p, r);
            randomizedQuicksort_f(arr, p, q-1);
            randomizedQuicksort_f(arr, q+1, r);
        }
    }
    public static int randomizedPartition(int arr[], int p, int r) {
        int i =  (int) ((Math.random() * (r - p)) + p);
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return partition(arr, p, r);
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
        randomizedQuicksort_f(arr, 0, arr.length-1); 
        System.out.println(Arrays.toString(arr)); 
    }
}
