package Telusko_Java_tutorials;

import java.util.Scanner;

public class StringOpDemo {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings");
        s1=sc.nextLine();
        s2=sc.nextLine();

        String s3=s1.concat(s2);
        System.out.println("Concatenated String is: "+s1+s2);
        System.out.println(s3);

        int l1=s1.length();
        int l2=s2.length();
        System.out.println("Length of First String: "+l1);
        System.out.println("Length of Second String: "+l2);

        s1 = s1.toUpperCase();
        System.out.println(s1);
    }
}
