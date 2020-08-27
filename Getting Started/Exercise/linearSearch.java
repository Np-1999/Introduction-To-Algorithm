
public class linearSearch {
    public static int search(int arr[], int key) {
        for(int i=0;i<arr.length;i++){
            if( arr[i] == key ) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {31,41,59,26,41,58};
        int index = search(arr,59);
        if(index!=-1){
            System.out.println("Key is present at "+index);
        }
        else{
            System.out.print("Key not found");
        }
    }    
}