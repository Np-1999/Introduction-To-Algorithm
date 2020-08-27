
public class binarySearch {
    public static int search(int arr[], int key, int start_index, int end_index) {
        if(start_index <= end_index){
            int mid =(int) ((start_index + end_index) / 2);
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] <key ){
                return search(arr, key, mid+1 , end_index);
            }
            else{
                return search(arr, key, start_index, mid );
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {26,31,41,41,58,59};
        int index = search(arr,26,0,(arr.length-1));
        if(index!=-1){
            System.out.println("Key is present at "+index);
        }
        else{
            System.out.print("Key not found");
        }
    }
}