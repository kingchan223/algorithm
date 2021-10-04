package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*최적화 코드로 다시 풀어보기 */
//dp를 해결한 후, 역추정을 해야하는 문제
public class B14002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] array = new int[n+1];
        int[] vp = new int[n+1];
        int[] dp = new int[n+1];
        int resultIdx = 0;
        int result = 1;
        int idx=1;
        while(st.hasMoreTokens()){
            array[idx++] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n + 1; i++)
            dp[i] = 1;
        if(n==1){
            System.out.println(1);
            System.out.println(array[1]);
        }
        else{
            for (int i = 2; i < n + 1; i++) {
                for(int j = i-1; j > 0; j-- ){
                    if((array[i] > array[j]) && dp[j]+1 > dp[i]){
                        dp[i] = dp[j]+1;
                        vp[i] = j;
                        if(result < dp[i]){
                            result = dp[i];
                            resultIdx = i;
                        }
                    }
                }
            }
            System.out.println(result);
            if(result>1){
                Stack<Integer> stack = new Stack<>();
                stack.add(resultIdx);

                while(vp[stack.peek()]!=0){
                    stack.push(vp[stack.peek()]);
                }
                while(!stack.isEmpty()){
                    System.out.print(array[stack.pop()]+" ");
                }
            }else{
                System.out.println(array[result]);
            }
        }
    }
}
