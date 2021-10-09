package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1149 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] cost = new int[n+1][3];
        int[][] d = new int[n+1][3];
        for (int i = 1; i < n+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }

        //초기화
        d[1][0] = cost[1][0];
        d[1][1] = cost[1][1];
        d[1][2] = cost[1][2];

        for (int i = 2; i <= n; i++) {
            d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + cost[i][0];
            d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + cost[i][1];
            d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + cost[i][2];
        }
        int result = 1_000_001;
        if(d[n][0]<result) result = d[n][0];
        if(d[n][1]<result) result = d[n][1];
        if(d[n][2]<result) result = d[n][2];
        System.out.println(result);
    }
}
