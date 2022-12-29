package Telusko_Java_tutorials;

public class AbstractDemo {
    public static void main(String[] args) {
        MaheshPhone obj=new SureshPhone();
        obj.call();
        obj.cook();
        obj.dance();
        obj.move();
    }
}
abstract class MaheshPhone{
    public void call(){
        System.out.println("Calling...");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}
abstract class RameshPhone extends MaheshPhone{
    @Override
    public void move() {
        System.out.println("Moving...");
    }
}
class SureshPhone extends RameshPhone{ // Concrete Class

    @Override
    public void dance() {
        System.out.println("Dancing...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }
}

