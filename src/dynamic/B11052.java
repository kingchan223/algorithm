package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] card = new int[n + 1];
        int[] result = new int[n + 1];
        int index = 1;
        while(st.hasMoreTokens())
            card[index++] = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                
            }
            result[i] = Math.max(card[i-1] + card[1], card[i]);
        }
    }
}
