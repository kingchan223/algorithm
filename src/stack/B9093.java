package stack;

import java.io.*;
import java.util.Stack;

public class B9093{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String words;
        Stack<Character> stack;
        for(int i=0; i<n; i++){
            words = br.readLine()+"\n";
            stack = new Stack<>();
            /* toCharArray */
            for(char alpha: words.toCharArray()){
                if(alpha==' ' || alpha=='\n'){
                    while(!stack.empty())
                        bw.write(stack.pop());
                    bw.write(" ");
                }else{
                    stack.push(alpha);
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}

