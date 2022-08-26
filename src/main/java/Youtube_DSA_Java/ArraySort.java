package Youtube_DSA_Java;

import java.util.Arrays;

public class ArraySort {

    public static int search(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a1 = new int[] {11,2,8,9,3,1,5};
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+" ");
        }
        Arrays.sort(a1);
        System.out.println("\nSorting an Elements in an Array");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+" ");
        }

        System.out.println("\n\nSearching an Element in an Array");
        int indexValue = search(a1,9);
        if(indexValue !=-1)
            System.out.println("Element found at index: "+indexValue);
        else
            System.out.println("Element not found");
    }
}
