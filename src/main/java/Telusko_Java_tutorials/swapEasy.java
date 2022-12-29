package Telusko_Java_tutorials;

public class swapEasy {
    public static void main(String[] args) {
        int a=5;
        int b=6;

        System.out.println("Before Swapping a:"+a+" b:"+b);
        b = a + b - (a=b);
        System.out.println("After Swapping a:"+a+" b:"+b);

    }
}
