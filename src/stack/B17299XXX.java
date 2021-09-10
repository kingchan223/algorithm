package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B17299XXX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] result = new int[n];
        int[] f = new int[n+1];
        StringTokenizer st = new StringTokenizer( br.readLine(), " ");
        for(int i=1; i<n+1; i++){
            int num = Integer.parseInt(st.nextToken());
            f[num] = f[num]+1;
            array[i-1] = num;
        }
        // arrayCnt에 각 숫자 몇 번 등장인지.
        // array :    [ 1, 1, 2, 3, 4, 2, 1]
        // arrayCnt : [ 0, 3, 2, 1, 1, 0, 0, 0]

        Stack<Integer> index = new Stack<>();
        int now = 1;
        index.push(0);

        for(int i=0; i<n-1; i++){
            while(!index.isEmpty() && ( f[array[index.peek()]] < f[array[now]] )){
                result[index.pop()] = array[now];
            }   
            index.push(now++);
        }
        while(!index.isEmpty()){
            result[index.pop()] = -1;
        }
        for (int i : result) {
            sb.append(i+" ");
        }
        System.out.println(sb);
    }
}
