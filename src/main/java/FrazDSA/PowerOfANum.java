package FrazDSA;

import java.util.Scanner;

public class PowerOfANum {

    public static long power(int x,int n){
        if(n==0) return 1;
        else if(x==0) return 0;
        long ans = power(x,n/2);
        if(n%2==1) return ans*ans*x;
        return ans * ans;
    }
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int n;
        n = sc.nextInt();
        System.out.println(power(x,n));
    }
}
