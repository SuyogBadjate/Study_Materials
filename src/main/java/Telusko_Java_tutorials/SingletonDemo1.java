package Telusko_Java_tutorials;

public class SingletonDemo1 {
    public static void main(String[] args) {
        ABC10 obj = ABC10.INSTANCE;
        obj.i=5;
        obj.show();

        ABC10 obj1=ABC10.INSTANCE;
        obj1.i=6;
        obj1.show();
    }
}
enum ABC10{
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }
}
