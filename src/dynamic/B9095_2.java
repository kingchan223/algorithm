package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9095_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[] d = new int[11];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        for (int t = 0; t < tc; t++) {
            int n = Integer.parseInt(br.readLine());
            if(d[n] > 0){
                System.out.println(d[n]);
                continue;
            }
            for (int i = 4; i < n+1; i++) {
                if(d[n] > 0) continue;
                d[i] = d[i - 1] + d[i - 2] + d[i - 3];
            }
            System.out.println(d[n]);
        }
    }
}
