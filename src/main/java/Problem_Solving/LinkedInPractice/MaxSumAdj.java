//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving.LinkedInPractice;

public class MaxSumAdj {


    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 1, -6};
        System.out.println(MaxSumDiff(arr));
    }

    static int MaxSumDiff(int[] arr) {
        int max = Math.max(Math.abs(arr[0] - arr[3]), Math.abs(arr[1] - arr[0]));

        for(int i = 1; i < arr.length - 1; ++i) {
            max = Math.max(max, Math.abs(arr[i + 1] - arr[i]));
        }

        return max;
    }
}
