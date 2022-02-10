package dynamic;

import java.io.*;

public class B15988xxx {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long[] memo = new long[1000001];
        memo[0] = 1;
        memo[1] = 1;
        memo[2] = 2;

        for(int i=3; i<=1_000_000; i++) memo[i] = (memo[i-1]+memo[i-2]+memo[i-3])%1_000_000_009;

        for(int t=0; t<n; t++){
            int num = Integer.parseInt(br.readLine());
            sb.append(memo[num] % 1_000_000_009).append("\n");
        }

        System.out.println(sb);
    }
}
