import java.io.*;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int status;
        while (n-- > 0){
            status = 0;
            String str = br.readLine();
            Stack<Character> stack = new Stack<Character>();
            for (char o : str.toCharArray()){
                if (o == '(')
                    stack.push(o);
                else{// ')'
                    if (stack.empty()){
                        status = 1;
                        bw.write("NO\n");
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(status==0){
                if(stack.empty()){
                    bw.write("YES\n");
                }
                else{
                    bw.write("NO\n");
                }
            }
        }
        bw.flush();
    }
}
