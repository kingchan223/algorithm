package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n + 1];
        int[] d = new int[n + 1];

        for (int i = 1; i < n + 1; i++){
            arr[i] =Integer.parseInt(st.nextToken());
            d[i] = 1;
        }

        int maxIn = 1;
        int maxDe = 1;
        int result = maxIn + maxDe;
        for(int t=1; t<n+1; t++){
            //가장 긴 증가하는 수열
            for(int i1=1; i1<t; i1++){
                for (int j1 = i1 - 1; j1 > 0; j1--) {
                    if (arr[i1] > arr[j1] && d[i1] < d[j1] + 1)
                        d[i1] = d[j1] + 1;
                }
                if(maxIn < d[i1]) maxIn = d[i1];
            }
            //가장 긴 감소하는 수열
            for(int i1=t; i1<n+1; i1++){
                for (int j1 = i1 - 1; j1 > 0; j1--) {
                    if (arr[i1] < arr[j1] && d[i1] < d[j1] + 1)
                        d[i1] = d[j1] + 1;
                }
                if(maxDe < d[i1]) maxDe = d[i1];
            }
            if(result < maxIn + maxDe) result = maxIn+maxDe;

            for (int i = 1; i < n + 1; i++)
                d[i] = 1;
            maxIn = 1;
            maxDe = 1;
            result = maxIn + maxDe;

        }
        System.out.println(result);
    }
}
