package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B9020XXX {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseN = Integer.parseInt(br.readLine());
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

        for(int cn=0; cn<caseN; cn++){
            int evenNum = Integer.parseInt(br.readLine());
            int minDiff = 10000;
            int a=0; int b=0;
            int i = 1;
            while(i<1000){
                i++;
                if(!check[i]){
                    if (evenNum-i>0 && !check[evenNum-i]){
                        if(Math.abs((evenNum-i)-i) < minDiff){
                            minDiff = Math.abs(evenNum-2*i);
                            if(i<=evenNum){
                                a = i;
                                b = evenNum-i;
                            }
                            else{
                                a = evenNum-i;
                                b = i;
                            }
                        }
                    }
                }
            }
            System.out.println(a+" "+b);
        }
    }
}
