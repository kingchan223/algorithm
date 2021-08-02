import java.io.*;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int n = Integer.parseInt(br.readLine());
        int[] number = new int[n];
        int index = 0;
        int now = 1;
        boolean status = true;
        for(int i=0; i<n; i++){
            number[i] = Integer.parseInt(br.readLine());
        }
        int[] arr = new int[5];
        arr.toString();
        while(index<n){
            if(number[index] > stack.peek()){
                stack.push(now++);
                bw.write("+\n");
            }
            else if(number[index++] == stack.peek()){
                stack.pop();
//                index++;
                bw.write("-\n");
            }
            else{//number[full] < stack.peek()
                status = false;
                System.out.println("NO");
                break;
            }
        }
        if(status){
            bw.flush();
        }
        bw.close();
    }
}
