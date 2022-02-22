package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] d = new int[k + 1];
        int[] v = new int[n];

        for (int i = 0; i < k + 1; i++) d[i] = 0;
        for (int i = 0; i < n ; i++) v[i] = 0;

        int min = 100_001;
        int idx = 0;
        for (int i = 0; i < n ; i++){
            v[i] = Integer.parseInt(br.readLine());
            d[v[i]] = 1;
            if(v[i] < min){
                min = v[i];
                idx = i+1;
            }
        }

        if(min > k) System.out.println(0);
        else{
            for (int i = idx + 1; i < k + 1; i++) {
                System.out.println("-----"+i+"-----");
                for(int val : v){// 1, 2, 5
                    System.out.println("val = " + val);
                    if(i-val > 0) d[i] += d[i - val];
                }
                // TODO 여기서 뭔가 예외를 추가하기
            }
            for (int i : d) {
                System.out.println(i+", ");
            }
        }
    }
}
