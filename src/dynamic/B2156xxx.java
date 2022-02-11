package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2156xxx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] v = new int[n+1];
        int[] d = new int[n+1];
        for (int i = 1; i < n+1 ; i++) v[i] = Integer.parseInt(br.readLine());
        d[1] = v[1];
        if (n > 1) d[2] = v[1] + v[2];
        if(n>2) d[3] = Math.max(v[1] + v[3], Math.max(v[1] + v[2], v[2] + v[3]));
        for (int i = 4; i < n + 1; i++) d[i] = Math.max(d[i - 3] + v[i-1] + v[i], Math.max(d[i - 2] + v[i], d[i - 1]));
        System.out.println(d[n]);
    }
}
