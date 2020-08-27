

public class VolatileStock_bruteForce {
    public static int bruteforce(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(max < arr[j]-arr[i]){
                    max = arr[j]-arr[i];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int prices[] = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
        int prices2[] = {10,11,7,10,6};
        System.out.println(bruteforce(prices2));
    }    
}