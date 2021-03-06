package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//i개의 최대값을 구하려면 i-1개, i-2개... 들의 최대값을 구해놔야한다. -> 이것이 DP
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
            for (int j = 1; j <= i; j++) {
                result[i] = Math.max(result[i], card[j] + result[i - j]);//j+ i-j 는 i개이다.
            }
        }
        System.out.println(result[n]);

    }
}
