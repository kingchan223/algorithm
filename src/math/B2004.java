package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* nCm = n!/(n-m)!*m!
* 0의 개수는 2와 5의 쌍이 하나 있어야 가능.
* 곧 5의 개수가 세개여도, 2가 1개면 0은 1개임
* 반대로 2의 개수가 3개여도 5가 1개면 0은 1개임
* 그러므로 각 2, 5의 개수의 최소값이 0의 개수라고 할 수 있음
* */
public class B2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long numOfTwo = 0;
        long numOfFive = 0;

        for(long i=2; i<=n; i*=2){
            numOfTwo += n/i;
        }
        for(long i=2; i<=n-m; i*=2){
            numOfTwo -= (n-m)/i;
        }
        for(long i=2; i<=m; i*=2){
            numOfTwo -= m/i;
        }

        for(long i=5; i<=n; i*=5){
            numOfFive += n/i;
        }
        for(long i=5; i<=n-m; i*=5){
            numOfFive -= (n-m)/i;
        }
        for(long i=5; i<=m; i*=5){
            numOfFive -= m/i;
        }

        if(numOfFive >= numOfTwo) System.out.println(numOfTwo);
        else System.out.println(numOfFive);
    }
}
