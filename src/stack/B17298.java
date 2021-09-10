package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B17298 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //첫라인에 입력받은 정수크기의 int배열을 만들고, 두번째 라인에 입력받은 수들을 배열안에 넣기
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] result = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int aindex = 1;
        stack.push(0);

        for(int i=0; i<n-1; i++){
            while((!stack.isEmpty()) && (array[stack.peek()] < array[aindex])){
                result[stack.pop()] = array[aindex];
            }
            stack.push(aindex);
            aindex++;
        }

        while(!stack.isEmpty()){
            result[stack.pop()] = -1;
        }

        for (int i : result) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
