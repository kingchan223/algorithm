package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B2225xxx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long[][] d = new long[n+1][k+1];

        for(int i=0; i<=k ;i++){
            d[0][i] = 1;
        }

        for (int i = 1 ; i <= n; i++) {
            d[i][0] = 0;
        }

        for (int i = 1 ; i <= k; i++) {
            d[1][i] = i;
        }

         for(int n_ = 2; n_ <= n; n_++){
             for (int i = 0; i <= n_; i++){
                 for (int k_ = 1; k_ <= k; k_++){
                     d[n_][k_] += (d[n_-i][k_-1]);
                     d[n_][k_]%=1_000_000_000;
                 }
             }
         }
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= k; j++) {
//                System.out.println("["+i+", "+j+"] :"+ d[i][j]);
//            }
//        }
        System.out.println(d[n][k]);
    }

//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt(); // n 입력받음
//        int k = s.nextInt(); // k 입력받음
//
//        int[][] dp = new int[201][201]; // k번 더해서 n이 되는 경우의 수
//
//        for(int i=1;i<=k;i++) {
//            dp[i][0]=1;
//        }
//        for(int i=1;i<=k;i++) {
//            for(int j=1;j<=n;j++) {
//                dp[i][j] = (dp[i][j-1] + dp[i-1][j])%1000000000; // 1000000000으로 나누는 걸 출력할 때 주면 틀렸다고 뜸.
//            }
//        }
//        System.out.println(dp[k][n]);
//    }
}
