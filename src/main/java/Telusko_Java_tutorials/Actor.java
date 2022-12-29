package Telusko_Java_tutorials;

public interface Actor {
    void act();
    void speak();
    default void comedy(){
        System.out.println("In main Actor Interface");
    }
}
