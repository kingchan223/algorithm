package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2225 {
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
        for (int i = 1 ; i <= n; i++) {
            d[i][1] = 1;
        }
         for(int i = 2; i <= k; i++){
             for (int j = 1; j <= n; j++){
                 for(int p=0; p<=j; p++){
                     d[j][i] += d[j-p][k-1];
                 }
             }
         }

        System.out.println(d[n][k]);
    }
}
