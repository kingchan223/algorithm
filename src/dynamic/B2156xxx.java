package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2156xxx {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        boolean[] ckecked = new boolean[n + 1];
        int[] d = new int[n + 1];
        d[0] = 0;
        arr[0] = 0;
        for (int i = 1; i < n+1; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            if(i==1) {
                d[1] = num;
                ckecked[1] = true;
            }
            if(i==2){
                d[2] = num+d[1];
                ckecked[2] = true;
            }
        }
        for (int i = 3; i <= n; i++) {
            d[i] = 0;
            if(ckecked[i-1]&&ckecked[i-2]){
                if(d[i] < d[i-2] + arr[i]){
                    d[i] = d[i-2] + arr[i];
                    ckecked[i-1] = false;
                    ckecked[i] = true;
                }
                if(d[i] < d[i-1] - arr[i-2] + arr[i]){
                    d[i] = d[i-1] - arr[i-2] + arr[i];
                    ckecked[i-2] = false;
                    ckecked[i-1] = true;
                    ckecked[i] = true;
                }
                if(d[i] < d[i-1]){
                    d[i] = d[i-1];
                    ckecked[i-2] = true;
                    ckecked[i-1] = true;
                    ckecked[i] = false;
                }
            }
            else{
                d[i] = d[i-1]+arr[i];
                ckecked[i] = true;
            }
        }
        System.out.println(d[n]);
    }
}
