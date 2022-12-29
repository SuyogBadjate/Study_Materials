package Telusko_Java_tutorials;

public class AbstractEx {
    public static void main(String[] args) {
         Samsung obj=new Samsung();
         show(obj);
    }
    public static void show(Phone p){
        p.showConfig();
    }
}
abstract class Phone{
    public abstract void showConfig();
}
class Iphone extends Phone{
    public void showConfig(){
        System.out.println("2 GB,IOS 9.3");
    }
}
class Samsung extends Phone{
    public void showConfig(){
        System.out.println("2 GB,Lolipop");
    }
}