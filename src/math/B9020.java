package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B9020 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] prime = new int[10001];
        int pn = 0;
        boolean[] check = new boolean[10001];
        int n = 10000;
        for(int i=2; i<n+1; i++){
            if(!check[i]){
                prime[pn++] = i;
                for(int j=i+i; j<=n;j+=i){
                    check[j] = true;
                }
            }
        }//false면 소수

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int num = Integer.parseInt(br.readLine());
            int a = 0;
            int b = 10000;
            for(int j=0; j<10001; j++){
                if(prime[j]>(num/2)) break;
                if(!check[num-prime[j]]){
                    if(Math.abs(prime[j] - (num-prime[j])) < Math.abs(a-b)){
                        a = prime[j];
                        b = num-prime[j];
                    }
                }
            }
            System.out.println(a+" "+b);
        }
    }
}
