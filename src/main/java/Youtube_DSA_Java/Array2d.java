package Youtube_DSA_Java;
//Creation and Implementation of 2D Array
public class Array2d {
    public static void main(String[] args) {
        int[][] a1= new int[3][4];
        int count=1;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = count;
                count++;
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
