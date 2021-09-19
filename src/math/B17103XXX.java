package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17103XXX {
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
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            int result = 0;
            int now;
            for(int j=0; j<prime.length; j++){
                if(prime[j]==0 || prime[j] >= num) break;
                if(!check[num-prime[j]]  ){
                    now = prime[j];
                    System.out.println("j="+j+":"+prime[j]+" + "+(num-prime[j]));
                    System.out.println(check[num-prime[j]]);
                    result += 1;
                }
            }
            System.out.println(result);
        }
    }
}
