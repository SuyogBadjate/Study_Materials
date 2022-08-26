package FrazDSA;

import java.util.Scanner;

public class FactorialNbr {
    static int factorial(int number){
        if(number==0) return 1;
        int partialAns = factorial(number-1);
        return number * partialAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            System.out.println("Error");
        }else{
            System.out.println(factorial(number));
        }
    }
}
