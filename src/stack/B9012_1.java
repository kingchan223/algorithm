package stack;

import java.io.*;


public class B9012_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int status;
        while (n-- > 0){
            status = 0;
            String str = br.readLine();
            int cnt = 0;
            for (char o : str.toCharArray()){
                if (o == '(')
                    cnt++;
                else{// ')'
                    if (cnt==0){
                        status = 1;
                        bw.write("NO\n");
                        break;
                    }else{
                        cnt--;
                    }
                }
            }
            if(status==0){
                if(cnt==0){
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
