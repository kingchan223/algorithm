package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[2][100_000];
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int[][] d = new int[2][n];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++ ){
                arr[0][j] = Integer.parseInt(st.nextToken());
            }

            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++ ){
                arr[1][j] = Integer.parseInt(st2.nextToken());
            }
            //배열 입력
            //까지

        }
    }
}
