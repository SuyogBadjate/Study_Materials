package Telusko_Java_tutorials;

public class StaticDemo {
    public static void main(String[] args) {
        Abc1.show();
        Abc1.i=5;
    }
}
class Abc1{
    static int i;
    public static void show(){
          System.out.println("Hi");
          System.out.println(i);
      }
}