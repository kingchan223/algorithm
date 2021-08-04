package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

class Queue{
    private int[] queue = new int[100];
    private int start = 0;
    private int end = 0;

    Queue(){}

    public void push(int i){
        queue[end++] = i;
    }

    public void pop(){
        if(emptyReturn()==1){
            System.out.println(-1);
            return;
        }
        System.out.println(queue[start++]);
    }

    public void size(){
        if(end==start){
            System.out.println(0);
            return;
        }
        else
            System.out.println(end-start);
    }

    public int sizeReturn(){
        if(end==start){
            return 0;
        }
        else
            return end-start+1;
    }

    public int emptyReturn(){
        if(sizeReturn()==0)
            return 1;
        else
            return 0;
    }

    public void empty(){
        if(sizeReturn()==0)
            System.out.println(1);
        else
            System.out.println(0);
    }

    public void front(){
        if(emptyReturn()==1){
            System.out.println(-1);
            return;
        }
        System.out.println(queue[start]);
    }

    public void back(){
        if(emptyReturn()==1){
            System.out.println(-1);
            return;
        }
        System.out.println(queue[end-1]);
    }

}
public class B10845 {
    public static void main(String[] args) throws IOException {

        Queue q = new Queue();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push":
                    q.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    q.pop();
                    break;
                case "size":
                    q.size();
                    break;
                case "empty":
                    q.empty();
                    break;
                case "front":
                    q.front();
                    break;
                default:
                    q.back();
                    break;
            }
        }
    }
}
