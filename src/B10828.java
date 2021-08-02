import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10828 {
    int[] stack = new int[10000];
    int size = 0;

    public B10828() {}

    public void push(int a){
        stack[size] = a;
        size++;
    }

    public void pop(){
        if(size>0){
            System.out.println(stack[--size]);
            stack[size] = 0;
        }
        else{
            System.out.println(-1);
        }
    }

    public void size(){
        System.out.println(size);
    }

    public void empty(){
        if(size==0)
            System.out.println(1);
        else
            System.out.println(0);
    }

    public void top(){
        if(size>0){
            System.out.println(stack[size-1]);

        }
        else
            System.out.println(-1);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        B10828 stack = new B10828();

        for(int i=0; i<n; i++){
            String str = br.readLine();
            if(str.contains("push")){
                st = new StringTokenizer(str, " ");
                st.nextToken();
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(str.contains("pop")){
                stack.pop();
            }else if(str.contains("size")){
                stack.size();
            }else if(str.contains("empty")){
                stack.empty();
            }else{//top
                stack.top();
            }
        }
    }
}
