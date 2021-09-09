package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978 {
    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i=2; i*i<=n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<t; i++){
            if(prime(Integer.parseInt(st.nextToken()))) result++;
        }
        System.out.println(result);
    }
}
