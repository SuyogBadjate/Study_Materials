//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving.GFG.Learn_DSA;

public class Linear_Search {

    static int linearSearch(int[] arr, int n, int e) {
        if (n == 0) {
            return -1;
        } else {
            for(int i = 0; i < n; ++i) {
                if (arr[i] == e) {
                    return i;
                }
            }

            return linearSearch(arr, n - 1, e);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 15, 25, 98};
        int e = 9;
        int index = linearSearch(arr, arr.length, e);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

    }
}
