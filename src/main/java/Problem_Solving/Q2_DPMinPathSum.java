//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving;

public class Q2_DPMinPathSum {

    public static void main(String[] args) {
        int[][] a = new int[][]{{-1}, {-5, -4}, {1, -1, -3}};

        for(int i = a.length - 2; i >= 0; --i) {
            for(int j = a[i].length - 1; j >= 0; --j) {
                int temp = Math.min(a[i + 1][j], a[i + 1][j + 1]);
                a[i][j] += temp;
            }
        }

        System.out.println(a[0][0]);
    }
}
