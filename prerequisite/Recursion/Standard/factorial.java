
public class factorial {
    public static int recursive(int no){
        /*base case*/
        if(no==0){
            return 1;
        }
        else{
            /*induction and hypothesis */
            return no*recursive(no-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursive(4));
    }    
}