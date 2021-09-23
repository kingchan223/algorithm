package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] memo = new long[n + 1];
        memo[1] = 1;
        if(n>1) memo[2] = 2;

        for(int i=3; i<=n;i++){
            memo[i] = (memo[i - 1] + memo[i - 2])%10007;/* 왜 여기서 나머지를 구하면 맞고,*/
        }
        System.out.println(memo[n]);/* 여기서 나머지를 memo[n]%10007로 하면 틀린지 모르겠음*/
    }
}
