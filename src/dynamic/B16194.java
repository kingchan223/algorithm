package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B16194 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] card = new int[n + 1];
        int[] result = new int[n + 1];
        for (int i=1 ; i<=n; i++) {
            result[i]=1000*10000;
        }
        int index = 1;

        while(st.hasMoreTokens())
            card[index++] = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            for (int j = 1; j <= i; j++) {
                result[i] = Math.min(result[i], card[j] + result[i - j]);
            }
        }
        System.out.println(result[n]);

    }
}
