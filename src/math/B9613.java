package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9613 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int[] numbers = new int[n];
            for(int j=0; j<n;j++){
                numbers[j] = Integer.parseInt(st.nextToken());
            }
            long result = 0;
            for(int k=0; k<n; k++){
                for(int q=k+1; q<n; q++){
                    result += gcd(numbers[k], numbers[q]);
                }
            }
            System.out.println(result);
        }
    }
}
