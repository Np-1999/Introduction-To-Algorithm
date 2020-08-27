

public class VolatileStock_dac {
    public static int combine(int arr[], int low, int mid, int high) {
        int left_sum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=mid;i>=low;i--){
            sum = sum + arr[i];
            if(sum >left_sum){
                left_sum = sum;
            }
        }
        int right_sum = Integer.MIN_VALUE;
        sum =0;
        for(int i = mid+1;i<arr.length;i++ ){
            sum = sum + arr[i];
            if(sum >right_sum){
                right_sum = sum;
            }
        }
        return left_sum + right_sum;
    }
    public static int divideAndConquer(int arr[],int low,int high) {
        if( low == high ){
            return arr[low];
        }
        else{
            int mid = (int)(low+high)/2;
            int left_subarray = divideAndConquer(arr, low, mid);
            int right_subarray = divideAndConquer(arr, mid+1, high);
            int combine_subarray = combine(arr, low, mid, high);
            if(left_subarray > right_subarray && left_subarray > combine_subarray ){
                return left_subarray;
            }
            else if( right_subarray > left_subarray && right_subarray >combine_subarray ){
                return right_subarray;
            }
            else{
                return combine_subarray;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        System.out.println(divideAndConquer(arr, 0, arr.length-1));    
    }    
}