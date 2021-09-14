package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
* nCm = n!/(n-m)!*m!
* 0의 개수는 2와 5의 쌍이 하나 있어야 가능.
* 곧 5의 개수가 세개여도, 2가 1개면 0은 1개임
* 반대로 2의 개수가 3개여도 5가 1개면 0은 1개임
* 그러므로 각 2, 5의 개수의 최소값이 0의 개수라고 할 수 있음
* */
public class B2004_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long two = 0, five = 0;
        for (long i=2; i<=n; i*=2) {
            two += n/i;
        }
        for (long i=2; i<=n-m; i*=2) {
            two -= (n-m)/i;
        }
        for (long i=2; i<=m; i*=2) {
            two -= m/i;
        }
        for (long i=5; i<=n; i*=5) {
            five += n/i;
        }
        for (long i=5; i<=n-m; i*=5) {
            five -= (n-m)/i;
        }
        for (long i=5; i<=m; i*=5) {
            five -= m/i;
        }
        System.out.println(Math.min(two,five));
    }
}
