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
        int[] d1 = new int[n + 1];
        int[] d2 = new int[n + 1];

        for (int i = 1; i < n + 1; i++)
            arr[i] =Integer.parseInt(st.nextToken());

        arr[0] = 1001;
        int result = -1;
        int maxIn = 0;
        int maxDe = 0;

        //arr = { 1 5 2 1 4 3 4 5 2 1 }
        for(int i=1; i<n+1; i++){
            d1[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                if (arr[i] > arr[j] && d1[i] < d1[j] + 1)
                    d1[i] = d1[j] + 1;
            }
            if(maxIn < d1[i]) maxIn = d1[i];
        }

        result = maxIn;
        for(int i=1; i<n+1; i++){
            d2[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                if (arr[i] < arr[j] && d2[i] < d2[j] + 1)
                    d2[i] = d2[j] + 1;
            }
            if(maxDe < d2[i]) maxDe = d2[i];
        }
        if(result < maxDe) result = maxDe;

        maxDe = 0;
        maxIn = 0;

        for(int t=1; t<n+1; t++){
            //가장 긴 증가하는 수열
            for(int i=1; i<t; i++){
                d1[i] = 1;
                for (int j = i - 1; j > 0; j--) {
                    if (arr[i] > arr[j] && d1[i] < d1[j] + 1)
                        d1[i] = d1[j] + 1;
                }
                if(maxIn < d1[i]) maxIn = d1[i];
            }

            //가장 긴 감소하는 수열
            d2[t-1] = 0;
            for(int i=t; i<n+1; i++){
                d2[i] = 1;
                for (int j = i - 1; j > 0; j--) {
                    if (arr[i] < arr[j] && d2[i] < d2[j] + 1)
                        d2[i] = d2[j] + 1;
                }
                if(maxDe < d2[i]) maxDe = d2[i];
            }

//            System.out.println("t="+t+"   maxIn:"+maxIn+" , maxDe:"+maxDe);
//            for (int i : d1) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//            for (int i : d2) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//            System.out.println();
            if(result < maxIn + maxDe) result = maxIn+maxDe;

            for (int i = 1; i < n + 1; i++){
                d1[i] = 0;
                d2[i] = 0;
            }
            maxIn = 0;
            maxDe = 0;
        }
        System.out.println(result);
    }
}
