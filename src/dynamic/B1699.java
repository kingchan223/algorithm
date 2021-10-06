package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[100_000];

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            dp[i] = i;/*최솟값을 구하는 문제는 초기값이 0이면 안된다.*/
            for (int j = 1; j*j <= i; j++) {/*제곱수*/
                if(dp[i] > dp[i-j*j] + 1)
                    dp[i] = dp[i-j*j] + 1;
            }
        }

        System.out.println(dp[n]);
    }
}
