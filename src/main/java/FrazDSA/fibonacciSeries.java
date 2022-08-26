package FrazDSA;

import java.util.Scanner;

public class fibonacciSeries {
    public static int fibo(int n){
        if(n<3) return 1;
        int secondLstTerm = fibo(n-1);
        int thirdLstTerm = fibo(n-2);
        return thirdLstTerm+secondLstTerm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
