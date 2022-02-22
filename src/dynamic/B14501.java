package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] d = new int[n + 1];
        int[] v = new int[n + 1];
        int[] day = new int[n + 1];
        for (int i = 1; i < n+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            day[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        d[0] = 0;
        v[0] = 0;
        day[0] = 0;

        int now;
        for (int i = 1; i < n + 1; i++) {
            now = 0;
            if(day[i] == 1) now = v[i];
            d[i] = d[i-1] + now;
            for (int j = 1; j < i + 1; j++)
                if(i-j+1 == day[j]){
//                    System.out.println("i="+i+" ,j="+j+"  day["+j+"] = "+ day[j]);
                    d[i] = Math.max(d[i], d[j-1] + v[j]);
                }
        }

        System.out.println(d[n]);
    }
}
