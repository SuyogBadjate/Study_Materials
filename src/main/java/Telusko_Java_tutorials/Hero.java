package Telusko_Java_tutorials;

public class Hero implements Actor{
    @Override
    public void act() {
        System.out.println("I can Act");
    }

    @Override
    public void speak() {
        System.out.println("I can Speak");
    }

    public void comedy(){
        System.out.println("I can do comedy");
    }
}
