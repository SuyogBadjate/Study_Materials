package Java_Practice_Questions;

import java.util.Arrays;

public class Main {

    static int numBoxes(int[] a, int k) {
        Arrays.sort(a);
        int n = a.length;
        int i = 0, j = n - 1, count = 0;
        while (i <= j) {
            count++;
            if (a[i] + a[j] <= k)
                i++;
            j--;
        }
        return count;
    }
    public static void main(String[] args) {
	// write your code here
        int[] A = { 3, 2, 2, 1 };
        int K = 3;
        System.out.println(numBoxes(A,K));
    }
}
