package Telusko_Java_tutorials;

import java.util.Random;

public class Two_DArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {11,22,33,44};
        int arr3[] = {111,222,333,444};

        int[] nums=new int[10];
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            nums[i]=r.nextInt(50);
        }
        int p[][]={
                {4,6,7,8},
                {6,7,8,9},
                {9,8,7,6}
        };

        //Jagged Array
        int p1[][]={
                {4,6,7,8},
                {6,7},
                {9,8,7}
        };


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }

        for (int i:nums) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i[]:p1) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int k[][]=new int[3][];

        k[0]=new int[4];
        k[1]=new int[2];
        k[2]=new int[3];
    }
}
