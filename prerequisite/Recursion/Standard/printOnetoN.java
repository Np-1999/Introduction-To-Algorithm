

public class printOnetoN {
    public static void print(int n){
        /*Base condition*/
        if ( n==1 ){
            System.out.print(n);
            return;    
        }

        
            /*Hypothesis*/
            print(n-1);
            /*Induction*/
            System.out.print(", "+n);
        
        
    }
    public static void main(String[] args) {
        print(7);       
    }
}