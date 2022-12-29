package Telusko_Java_tutorials;

public class CountObject {
    public static void main(String[] args) {
        A obj=new A();
        A obj1=new A();
        A obj2=new A();
        obj1.Counter();
    }
}
class A{
    static int i;
    public A(){
        i++;
    }
    public void Counter(){
        System.out.println(i);
    }
}
