package math;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int[] prime = new int[100];//맨 앞부터 소수가 하나씩 채워진다.
        int pn = 0;
        boolean[] check = new boolean[101];
        int n = 100;

        for (int i = 2; i < n; i++) {
            if (!check[i]) {
                prime[pn++] = i;
                for (int j = i + i; j <= n; j += i) {
                    check[j] = true;
                }
            }
        }

        for (int i : prime) {
            if (i != 0)
                System.out.println(i);
        }
        for (int i = 0; i < 100; i++){
            System.out.println(i +" "+prime[i]);
        }
    }
}
