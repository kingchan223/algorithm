package stack;

import java.io.*;
import java.util.Stack;

public class B9093_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = null;
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String str = br.readLine();
            stack = new Stack<>();
            for(char c : str.toCharArray()){
                stack.push(c);
            }
            while(!stack.empty()){
                sb.append(stack.pop());
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

