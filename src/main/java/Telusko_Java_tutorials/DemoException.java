package Telusko_Java_tutorials;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        int i,j,k=0;
        Scanner sc=new Scanner(System.in);

        i=8;
        try {
            System.out.println("Enter a number: ");
            j=sc.nextInt();
            k = i + j;
            if(k<10){
                throw new ArithmeticException();
            }
            System.out.println("Output is : "+k);
            System.out.println("Bye");
        }
        catch(InputMismatchException e){
            System.out.println("Some IO Error");
        }
        catch(ArithmeticException e){
            System.out.println("Minimum value for the output is 10 ");
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally {
            sc.close();
            System.out.println("Finally Bye");
        }
    }
}
