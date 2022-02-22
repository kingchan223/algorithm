package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2225xxx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long[][] d = new long[n + 1][k + 1];

        for (int i = 0; i < n + 1; i++)
            for (int j = 0; j < k + 1; j++)
                d[i][j] = -1;

        d[0][1] = 0;
        for (int i = 1; i < n + 1; i++) {
            d[i][1] = 1;
            d[i][0] = 0;
            d[i][2] = i+1;
        }

        d[0][0] = 0;
        for (int i = 1; i < k + 1; i++) d[0][k] = 1;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                int temp = 0;
                if (d[i][j] < 0) {
                    for (int i2 = i; i2 >= 0; i2--) {
                        temp += d[i2][j - 1];
                    }
                    d[i][j] = temp;
                }
            }
        }
        System.out.println(d[n][k]);
    }
}





