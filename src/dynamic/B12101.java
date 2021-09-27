package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        int[][] memo = new int[n+1][4];
        //memo[4][2]라면 4를 만드는 식들중 2가 몇개 필요한지임
        memo[1][1] = 1;
        if(n>1){
            memo[2][1] = 1;
            memo[2][2] = 1;
        }
        if(n>2){
            memo[3][1] = 2;
            memo[3][2] = 1;
            memo[3][3] = 1;
        }

        for(int i=4; i<=n; i++){
            for(int j=1; j<=3; j++){
                memo[i][j] = memo[i-1][j] + memo[i-2][j] + memo[i-3][j];
            }
        }

        int o = memo[n][1] + memo[n][2] + memo[n][3];
        if(o<k)
            System.out.println(-1);
        else{
            int len=0;
            char[] result = new char[11];
            int i=0;
            while(k>0&&n>0){
                if(k<=memo[n][1]){
                    n-=1;
                    result[i++] = '1';
                    len++;
                }
                else if(k<=memo[n][1]+memo[n][2]){
                    k-=memo[n][1];
                    n-=2;
                    result[i++] = '2';
                    len++;
                }else{
                    k-=memo[n][1] + memo[n][2];
                    n-=3;
                    result[i++] = '3';
                    len++;
                }
            }
            int plus = len-1;
            for(int z=0; z<len; z++){
                System.out.print(result[z]);
                if(plus > z)
                    System.out.print('+');
            }
        }
    }
}
