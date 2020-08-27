import java.util.Arrays;

public class mergeSort {
    public static void merge(int arr[], int p, int q, int r) {
        int n1 = q-p+1;
        int n2 = r-q;
        int L[] = new int[n1+1];
        int R[] = new int[n2+1];
        for (int i=0;i<n1;i++){
            L[i] = arr[p+i];
        }
        for (int i=0;i<n2;i++){
            R[i] = arr[q+i+1];
        }
        int i=0;
        int j=0;
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        
        for (int k=p;k<=r;k++){
            if( L[i] < R[j] ){
                arr[k] = L[i++];
            }
            else{
                arr[k] = R[j++];
            }
        }
    }
    public static void sort(int arr[], int p, int r) {
        if( p < r ){
            int q = (int)((p+r)/2);
            sort(arr,p,q);
            sort(arr,q+1,r);
            merge(arr, p, q, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {31,41,59,26,41,58};
        sort(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }    
}