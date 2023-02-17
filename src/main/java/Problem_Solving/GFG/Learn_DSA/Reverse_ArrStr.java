//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving.GFG.Learn_DSA;

public class Reverse_ArrStr {

    static void reverseArr(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArr(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 9, 8, 5};
        int start = 0;
        int end = arr.length - 1;
        reverseArr(arr, start, end);
        int[] var4 = arr;
        int var5 = arr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int i = var4[var6];
            System.out.println(i);
        }

    }
}
