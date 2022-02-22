package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B17404 {
    private static final int R = 0;
    private static final int G = 1;
    private static final int B = 2;
    private static final int INF = 1_000_001;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] cost = new int[n + 1][3];
        int[][] d = new int[n + 1][3];
        for (int i = 1; i < n+1 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            cost[i][R] = Integer.parseInt(st.nextToken());
            cost[i][G] = Integer.parseInt(st.nextToken());
            cost[i][B] = Integer.parseInt(st.nextToken());
        }

        int result = INF;

        for (int c = 0; c < 3; c++) {
            d[1][c%3] = cost[1][c];
            d[1][(c+1)%3] = INF;
            d[1][(c+2)%3] = INF;

            for(int i=2; i<n+1; i++){
                d[i][R] = Math.min(d[i-1][G], d[i-1][B]) + cost[i][R];
                d[i][G] = Math.min(d[i-1][R], d[i-1][B]) + cost[i][G];
                d[i][B] = Math.min(d[i-1][R], d[i-1][G]) + cost[i][B];
            }
            d[n][c%3] = INF;

            result = Math.min(result, Math.min(d[n][R], Math.min(d[n][G], d[n][B])));
        }
        System.out.println(result);
    }
}
