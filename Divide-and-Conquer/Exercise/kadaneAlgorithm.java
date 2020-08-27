

public class kadaneAlgorithm {
    public static int maximumSum_linear(int arr[]){
        int max_sum_till = 0;
        int global_max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max_sum_till += arr[i];
            if(global_max < max_sum_till){
                global_max = max_sum_till;
            }
            if(max_sum_till <0)
                max_sum_till = 0;
        }
        return global_max;
    }
    public static void main(String[] args) {
        int arr[] = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        System.out.println(maximumSum_linear(arr));
    }    
}