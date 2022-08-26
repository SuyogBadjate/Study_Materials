package FrazDSA;

import java.util.Scanner;

public class SumOfNNaturalNbr {
    public static int NNaturalNbrSum(int number){
        if(number==1) return 1;
        return number + NNaturalNbrSum(number-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(NNaturalNbrSum(number));
    }
}
