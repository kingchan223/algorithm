package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17103 {
    public static void main(String[] args) throws IOException {
        int[] prime = new int[1000001];
        int pn = 0;
        boolean[] check = new boolean[1000001];
        int n = 1000000;
        for(int i=2; i<n; i++){
            if(!check[i]){
                prime[pn++] = i;
                for(int j=i+i; j<=n;j+=i){
                    check[j] = true;
                }
            }
        }
        check[0] = true;
        check[1] = true;
        //-> 1000000 이하의 소수 배열 만들기
        // check가 false면 소수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int result = 0;
            int num = Integer.parseInt(br.readLine());
            for(int j=0; j<1000001; j++){
                if(prime[j]>(num/2)){
                    break;
                }
                if(!check[num-prime[j]]){
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
