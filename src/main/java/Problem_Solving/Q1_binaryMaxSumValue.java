//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving;

import java.util.Scanner;

public class Q1_binaryMaxSumValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;

        for(int i = 0; i < n; ++i) {
            int a = Integer.parseInt(sc.next(), 2);
            int b = Integer.parseInt(sc.next(), 2);
            if (a + b > temp) {
                temp = a + b;
            }
        }

        String res = Integer.toBinaryString(temp);
        System.out.println(res);
    }
}
