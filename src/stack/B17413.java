package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();
        boolean isOpen = false;
        for(char c: str.toCharArray()){
            if (c=='<') {
                while(!stack.empty()){
                    sb.append(stack.pop());
                }
                sb.append('<');
                isOpen = true;
            }
            else if(!isOpen && c!=' '){
                stack.push(c);
            }
            else if(isOpen && c!='>'){
                sb.append(c);
            }
            else if(c==' ' && !isOpen ){
                while(!stack.empty()){
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            else{// c=='>'
                sb.append('>');
                isOpen = false;
            }
        }
        if(!stack.empty()){
            while(!stack.empty()){
                sb.append(stack.pop());
            }
        }
        System.out.println(sb);
    }
}
