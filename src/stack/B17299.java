package stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class B17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] result = new int[n];
        int[] f = new int[1000001];//이거 미리 선언
        StringTokenizer st = new StringTokenizer( br.readLine(), " ");
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            f[num] = f[num]+1;
            array[i] = num;
        }

        Stack<Integer> stack = new Stack<>();
        int now = 0;
        stack.push(now++);
        n--;
        while(n-->0){
            while(!stack.isEmpty() && f[array[stack.peek()]] < f[array[now]] ){
                result[stack.pop()] = array[now];
            }
            stack.push(now++);

        }
        while(!stack.isEmpty()){
            result[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : result) {
            bw.write(i+" ");
        }
        bw.write("\n");
        bw.flush();
    }
}
