/*Problem Statement: https://practice.geeksforgeeks.org/problems/lucky-numbers2911/1/?category[]=Recursion&amp;page=1&amp;query=category[]Recursionpage1 */
public class luckyNumbers
{
    // Complete the function
    // n: Input n
    // counter: variable has already been declared in driver code
    //          you just have to use this variable.
    static int counter = 2;
    
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        if(counter > n){
            return true;
        }
        if ( n%counter ==0 ){
            return false;
        }
        if( n % counter ==0 )
            return false;
        n -= n/counter;
        counter++;
        return isLucky(n);
    }
    public static void main(String[] args) {
        System.out.println(isLucky(19));
    }
}