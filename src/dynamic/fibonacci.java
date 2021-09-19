package dynamic;

public class fibonacci {
    public static long[] memo = new long[100];
    public static long fibo(int n){
        if( n <= 1){
            return n;
        }
        else{
            if(memo[n]>0){
                return memo[n];
            }
            memo[n] = fibo(n - 1) + fibo(n - 2);
            return memo[n];
        }
    }
    public static void main(String[] args) {
        int n = 70;
        System.out.println(fibo(n));
    }
}
