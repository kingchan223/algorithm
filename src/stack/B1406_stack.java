package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1406_stack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] charStrArr = br.readLine().toCharArray();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (char c : charStrArr) {
            left.push(c);
        }


        for(int i=0; i< charStrArr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String command = st.nextToken();
            switch (command) {
                case "L":
                    if (!left.empty())
                        right.push(left.pop());
                    break;
                case "D":
                    if (!right.empty())
                        left.push(right.pop());
                    break;
                case "B":
                    if (!left.empty())
                        left.pop();
                    break;
                default:
                    char plus = st.nextToken().charAt(0);
                    left.push(plus);
                    break;
            }
        }
        while(!left.empty()){
            right.push(left.pop());
        }
        while(!right.empty()){
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
