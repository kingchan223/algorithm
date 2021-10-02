import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;

public class Prac{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][10];
        dp[1][0] = 0;
        for(int i=1; i<=9; i++) dp[1][i] = 1;

        for(int i=2; i<=n; i++){
            dp[i][0] = dp[i - 1][1];
            dp[i][0]%=1_000_000_000;
            dp[i][9] = dp[i - 1][8];
            dp[i][9]%=1_000_000_000;
            for(int j=1; j<=8; j++){
                System.out.println(i+", "+ j);
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1];
                dp[i][j]%=1_000_000_000;
            }
        }
        long result = 0;
        for(int i=0; i<=9; i++){
            result += dp[n][i];
        }
        System.out.println(result%1_000_000_000);
    }
}


