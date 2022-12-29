package Telusko_Java_tutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) /*throws Exception*/ {

        String str = "";
//        int i;
//        while((i=System.in.read())!=48){
//            str=str+(char)i;
//        }
//        System.out.println(str);

//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        str=br.readLine();
        int i=0;
        Scanner sc=new Scanner(System.in);
        i=Integer.parseInt(sc.nextLine());
//        System.out.println("Hello "+str);
        System.out.println(i);
    }

}
