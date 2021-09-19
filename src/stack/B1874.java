package stack;

import java.io.*;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        int[] array = new int[len];
        for(int i=0; i< len; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        int now = 0;
        int arrayIdx = 0;
        Stack<Integer> stack = new Stack<>();

        while(array[len-1]!=0){

            if(stack.empty()){
                sb.append('+').append('\n');
                stack.push(++now);
            }
            else if(stack.peek()<array[arrayIdx]){
                sb.append('+').append('\n');
                stack.push(++now);
            }
            else if(stack.peek() > array[arrayIdx]){
                sb = new StringBuilder("NO");
                break;
            }
            else{
                sb.append('-').append('\n');
                array[arrayIdx] = 0;
                arrayIdx++;
                stack.pop();
            }
        }
        System.out.println(sb);
    }
}
