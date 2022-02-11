package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] memo = new int[n + 1];

        memo[1] = 0;
        if(n>1) memo[2] = 1;
        if(n>2) memo[3] = 1;

        for(int i=4; i<=n; i++){
            memo[i] = memo[i-1] + 1;
            if(i%2==0 && memo[i/2] + 1 < memo[i]) memo[i] = memo[i/2] + 1;
            if(i%3==0 && memo[i/3] + 1 < memo[i]) memo[i] = memo[i/3] + 1;
        }

        System.out.println(memo[n]);
    }
}
