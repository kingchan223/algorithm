package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] array = new int[n+1];
        int[] dp = new int[n+1];
        int result = 1;
        int idx=1;
        while(st.hasMoreTokens()){
            array[idx++] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < n + 1; i++) {
            dp[i] = 1;
        }
        for (int i = 2; i < n + 1; i++) {
            for(int j = i-1; j > 0; j-- ){
                if((array[i] > array[j]) && dp[j]+1 > dp[i]){
                        dp[i] = dp[j]+1;
                        if(result < dp[i]) result = dp[i];
                }
            }
        }
        System.out.println(result);
    }
}
