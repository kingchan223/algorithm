package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이진수가 최대 100만자리가 된다. 100만자리일때 8진수로는 약 33만자리 이다. 이는 자바로 표현할 수 없는 크기이다.
// 히여 한자리씩 헤걀할 수 있는 방법을 찾아야한다.
public class B1373XXX {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();
        int len = binary.length();

        int n = len / 3;//n=33개
        int m = len % 3;//m은 1개

        int now = 0;
        int temp = 0;
        if(m==1){
            if(binary.charAt(now++)=='1')
                System.out.print(1);
        }
        else if(m==2){
            if(binary.charAt(now++)=='1')
                temp += 2;
            if(binary.charAt(now++)=='1')
                temp += 1;
            System.out.print(temp);
        }

        int a = 0;
        int b = 0;
        int c = 0;
        while(n-->0){
            if(binary.charAt(now++)=='1') a = 4;
            else a=0;
            if(binary.charAt(now++)=='1') b = 2;
            else b=0;
            if(binary.charAt(now++)=='1') c = 1;
            else c=0;
            System.out.print(a+b+c);
        }
    }
}
