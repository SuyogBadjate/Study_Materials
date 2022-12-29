package Telusko_Java_tutorials;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        Random r=new Random();
        int b[]=new int[20];
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=i+1;
        }
        for (int i = 0; i < b.length; i++) {
             b[i]=r.nextInt(50);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        try {
            System.out.println(b[52]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum index is 49");
        }
        for(int i:b){
            System.out.println(i);
        }

    }
}
