/*Problem Statement: https://leetcode.com/problems/k-th-symbol-in-grammar/ */
public class kThgrammer {
    public static int kthGrammar(int N, int K) {
        if(N==1 && K==1){
            return 0;
        }
        int mid  = (int) (Math.pow(2,(N-1))/2);
        if(K>mid){
            return 1^kthGrammar(N-1,K-mid);
        }
        else{
            return kthGrammar(N-1,K);
        }
    }
    public static void main(String[] args) {
        System.out.println(kthGrammar(4,5));
    }
}
