package Telusko_Java_tutorials;

public class Villain implements Actor{

    @Override
    public void act() {
        System.out.println("I can Act");
    }

    @Override
    public void speak() {
        System.out.println("I can Speak");
    }

    public void fight(){
        System.out.println("I can Fight");
    }
}
