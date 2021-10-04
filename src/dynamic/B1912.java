package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        int result = -1000;
        int temp = 0;


        for (int i = 0; i < n; i++) {
            if(temp < temp + arr[i]) temp += arr[i];
            else temp = 0;
            result = Math.max(temp, result);
        }

//        for (int i = 0; i < n; i++) {
//            if(arr[i] < 0){
//                temp +=
//            }
//                temp += arr[i];
//            if(temp < result) temp = 0;
//            result = Math.max(temp, result);
//        }
        // 10 -4 3 1 5 6 -35 12 21 -1
        // 2 1 -4 3 4 -4 6 5 -5 1
        // -1 -2 -3 -4 -5

//        int front = 0;
//        int back = arr[0];
//        for (int i = 0; i < n; i++) {
//            front += arr[i];
//            if(front < back) temp = back;
//            result = Math.max(temp, result);
//        }
        System.out.println(result);
    }
}
