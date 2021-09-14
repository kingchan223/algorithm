package math;

import java.util.Scanner;

//더 빠른 방법
public class B1676_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i=5; i<=n; i*=5) {
            ans += n/i;
        }
        System.out.println(ans);
    }
}
