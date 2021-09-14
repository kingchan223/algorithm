package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* 팩토리얼의 0의 개수는 5의 개수를 구하라는 것과 같다. 예를 들어 10!에서 0의 개수를 구하라고 한다면 5의 개수를 구하면 된다.
* 왜냐하면 2*5가 있으면 0이 하나 생긴다. 근데 2는 5보다 무조건 많다. 그러니까 5만 구하면 되는거임
* */
public class B1676 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i=5; i<num+1; i+=5){
            int now = i;
            result++;
            while(true){
                now = now/5;
                if(now%5==0) result++;
                else break;
            }
        }
        System.out.println(result);
    }
}
