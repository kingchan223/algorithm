package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n + 1];
        int[] d = new int[n + 1];
        for (int i = 1; i < n + 1; i++)
            arr[i] =Integer.parseInt(st.nextToken());

        d[1] = arr[1];
        int result = d[1];
        for (int i = 2; i < n + 1; i++) {
            d[i] = arr[i];
            for (int j = i - 1; j > 0; j--) {
                if(arr[j]<arr[i] && d[j]>(d[i]-arr[i]) )
                    d[i] = d[j] + arr[i];
            }
            if(d[i] > result) result = d[i];
        }
        System.out.println(result);
    }
}
