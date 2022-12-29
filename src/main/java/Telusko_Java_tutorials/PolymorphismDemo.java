package Telusko_Java_tutorials;

public class PolymorphismDemo {
    public static void main(String[] args) {
        ABC1 obj=new ABC1();
        obj.show();
    }
}
class ABC2{
    //Method Overloading
    public void show(){
        System.out.println("In default show");
    }
}
class ABC1 extends ABC2{
    //Method Overriding
    public void show(){
        System.out.println("In B show");
    }
}
