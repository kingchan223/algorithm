package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {

    public static int[] getArray(int n){
        int[] prime = new int[n];
        boolean[] check = new boolean[n+1];
        int pn = 0;
        for(int i=2; i<=n; i++){
            if(!check[i]){
                prime[pn++] = i;
                for(int j=i+i; j<=n;j+=i){
                    check[j] = true;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] array = getArray(n);
        for (int i : array) {
            if(i==0) break;
            else if(m<=i) System.out.println(i);
        }
    }
}
