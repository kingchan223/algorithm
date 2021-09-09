package math;

public class IsDemical {
    // 소수: N이 소수가 되려면, 2보다 크거나 같고, N-1보다 작거나 같은 자연수로 나누어 떨어지면 안된다.
    public static boolean isDemical1(int n){
        if(n<2) return false;
        for(int i=2; i<= n-1; i++){//하여 N을 N-1보다 작거나 같은 수로 계속해서 나눠본다.
            if(n%2 == 0) return false;
        }
        return true;
    } //-> 시간 복잡도 O(N)


    //소수 : N이 소수가 되려면, 2보다 크거나 같고, N/2보다 작거나 같은 자연수로 나누어 떨어지면 안된다.
    public static boolean isDemical2(int n){
        if(n<2) return false;
        for(int i=2; i<= n/2; i++){//하여 N을 N-1보다 작거나 같은 수로 계속해서 나눠본다.
            if(n%2 == 0) return false;
        }
        return true;
    } //-> 시간 복잡도 : O(N/2) ==> O(N)

    //소수 : N이 소수가 되려면, 2보다 크거나 같고, 루트N 보다 작거나 같은 자연수로 나누어 떨어지면 안된다.
    public static boolean isDemical3(int n){
        if(n<2) return false;
        for(int i=2; i*i<= n; i++){//하여 N을 N-1보다 작거나 같은 수로 계속해서 나눠본다.
            if(n%i == 0) return false;
        }
        return true;
    } //-> 시간 복잡도 : O(루트N)
}
