//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving.LinkedInPractice;

public class PalindromePairs {

    public static void main(String[] args) {
        int[] arr = new int[]{43, 13, 456, 31, 57, 54, 900};
        System.out.println(palPairsCount(arr));
    }

    static int palPairsCount(int[] arr) {
        int count = 0;

        for(int i = 0; i < arr.length; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                int no = Integer.parseInt(arr[i] + "" + arr[j]);
                if (palindrome(no)) {
                    ++count;
                }
            }
        }

        return count;
    }

    static boolean palindrome(int a) {
        int temp = a;
        int res = 0;

        for(int rem = 0; temp > 0; temp /= 10) {
            rem = temp % 10;
            res = res * 10 + rem;
        }

        return a == res;
    }
}
