package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//만약 a, b, c, d의 gcd를 구한다면 a와 b의 gcd를 구하고, 그 gcd와 c의 gcd를 구하고, 그 gcd와 d의 gcd를 구하면 된다.
public class B17087 {

    public static int s = 0;


    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

    public static int diff(int a){
        int result = a-s;
        if(result < 0 ) return result*-1;
        else return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(sb.nextToken());
        int s = Integer.parseInt(sb.nextToken());
        B17087.s = s;
        sb = new StringTokenizer(br.readLine(), " ");
        int first = diff(Integer.parseInt(sb.nextToken()));
        while(n-- >1){
            first = gcd(first, diff(Integer.parseInt(sb.nextToken())));
        }
        System.out.println(first);

    }
}
