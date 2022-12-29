package Telusko_Java_tutorials;

public class ConstructorEx {
    public static void main(String[] args) {
       Abc obj=new Abc(5);
    }
}
class Abc{
    public Abc(){
        System.out.println("In default constructor");
    }
    public Abc(int i){
         System.out.println("In Abc Constructor int");
     }
//    public Abc(double j){
//        System.out.println("In Abc Constructor Para double");
//    }
}
