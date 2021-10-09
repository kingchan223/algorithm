package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] arr = new int[2][100_001];
        for(int t1=0; t1<t; t1++){

            int n = Integer.parseInt(br.readLine());
            int[][] d = new int[3][n+1];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=n; j++ ){
                arr[0][j] = Integer.parseInt(st.nextToken());
            }
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=n; j++ ){
                arr[1][j] = Integer.parseInt(st2.nextToken());

            }
            d[0][1] = 0;
            d[1][1] = arr[0][1];
            d[2][1] = arr[1][1];

            for (int i = 2; i <= n; i++) {

                d[0][i] = -1;
                if(d[0][i] < d[0][i-1]) d[0][i] = d[0][i-1];
                if(d[0][i] < d[1][i-1]) d[0][i] = d[1][i-1];
                if(d[0][i] < d[2][i-1]) d[0][i] = d[2][i-1];

                d[1][i] = Math.max(d[0][i - 1], d[2][i - 1]) + arr[0][i];
                d[2][i] = Math.max(d[1][i - 1], d[0][i - 1]) + arr[1][i];
            }
//            for(int j=1; j<=n; j++ ){
//                System.out.print(arr[0][j]+", ");
//            }
//            System.out.println();
//            for(int j=1; j<=n; j++ ){
//                System.out.print(arr[1][j]+", ");
//            }

//            System.out.println();
            int result = -1;
            if(d[0][n] > result) result = d[0][n];
            if(d[1][n] > result) result = d[1][n];
            if(d[2][n] > result) result = d[2][n];
            System.out.println(result);
        }
    }
}
