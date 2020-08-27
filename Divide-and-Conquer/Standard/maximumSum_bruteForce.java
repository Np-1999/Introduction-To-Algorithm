

public class maximumSum_bruteForce {
    public static int bruteforce(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = arr[i];
            if(sum>max){
                max = sum;
            }
            for(int j=i+1;j<arr.length;j++){
                sum += arr[j];
                if(sum> max)
                    max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        System.out.println(bruteforce(arr));
    }    
}