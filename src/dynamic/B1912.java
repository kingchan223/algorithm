package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*새로운 배열. 즉 dp배열을 만들 생각을 하자.*/
public class B1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        int[] d = new int[n];
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        int result = arr[0];
        d[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]+d[i-1] > arr[i]) d[i] = arr[i]+d[i-1];
            else d[i] = arr[i];
            if( result < d[i]) result = d[i];
        }
        System.out.println(result);
    }
}
