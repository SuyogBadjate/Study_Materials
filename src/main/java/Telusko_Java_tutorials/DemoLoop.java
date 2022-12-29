package Telusko_Java_tutorials;

public class DemoLoop {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            System.out.println(i);
        }

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
