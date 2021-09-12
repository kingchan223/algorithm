package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B6588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
        } //-> 1000000 이하의 소수 배열 만들기
          // check가 false면 소수

        while(true){
            int evenNum = Integer.parseInt(br.readLine());
            if(evenNum==0) break;
            int i = 2;
            while(i<1000001){
                i++;
                if(!check[i]){
                    if (!check[evenNum-i]){
                        System.out.println(evenNum+" = "+i+" + "+(evenNum-i));
                        break;
                    }
                }
            }
            if(i==1000001) System.out.println("Goldbach's conjecture is wrong.");
        }
    }
}
