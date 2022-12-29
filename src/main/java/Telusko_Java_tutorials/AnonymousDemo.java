package Telusko_Java_tutorials;

public class AnonymousDemo {
    public static void main(String[] args) {
        new K().k=29;
        new K().show();
    }

}
class K{
    int k;
    public void show(){
        System.out.println("Showing in K k value is: "+k);
    }
}
