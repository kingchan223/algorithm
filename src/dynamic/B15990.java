package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15990 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        long[][] dp = new long[1_000_001][4];

        dp[1][1] = 1;
        dp[1][2] = 0;
        dp[1][3] = 0;

        dp[2][1] = 0;
        dp[2][2] = 1;
        dp[2][3] = 0;

        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for(int j=4; j<=100_000; j++){
            dp[j][1] = (dp[j-1][2]+dp[j-1][3])%1_000_000_009;
            dp[j][2] = (dp[j-2][1]+dp[j-2][3])%1_000_000_009;
            dp[j][3] = (dp[j-3][1]+dp[j-3][2])%1_000_000_009;
        }

        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append((dp[n][1]+dp[n][2]+dp[n][3])%1_000_000_009).append("\n");
        }

        System.out.println(sb);
    }
}
