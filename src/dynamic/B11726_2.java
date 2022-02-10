package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11726_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        int[] d = new int[n + 1];
        d[0] = 1;
        d[1] = 1;
        for (int i = 2; i < n + 1; i++)
            d[i] = (d[i - 1] + d[i - 2])%10007;
        System.out.println(d[n]);
    }
}
