package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] memo = new int[11];
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;

        while(n-->0){
            int num = Integer.parseInt(br.readLine());
            for(int i=4; i<=num; i++){
                memo[i] = memo[i-3] + memo[i-2] + memo[i-1];
            }
            System.out.println(memo[num]);
        }
    }
}
