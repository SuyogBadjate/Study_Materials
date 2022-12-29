package Telusko_Java_tutorials;

public class SwapTwoNums {
    public static void main(String[] args) {
        int a=5,b=4;
        System.out.println("Before Swapping a:"+a+" b:"+b);
        int temp=a;
        a = b;
        b=temp;
        System.out.println("After Swapping a:"+a+" b:"+b);
        //without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping a:"+a+" b:"+b);
        //to reduce extra byte by working on bits
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping a:"+a+" b:"+b);
    }
}
