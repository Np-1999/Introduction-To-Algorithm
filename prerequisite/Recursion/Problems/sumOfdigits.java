import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Problem statement : https://www.hackerrank.com/challenges/recursive-digit-sum/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking */
public class sumOfdigits {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        String b = n;
        
        char a[] = b.toCharArray();
        long sum = 0;
            for(int i=0;i<a.length;i++){
                sum += Character.getNumericValue(a[i]);  
            }
        
        sum = sum * k;
        int ans = (int)solve(sum);
        return ans;
    }
    //Recursive Function 
    static long solve(long n){
        if(n<10){
            return n;
        }
        else{
            
            return solve((n%10)+solve(n/10));
        }
    }
//Ignore
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
