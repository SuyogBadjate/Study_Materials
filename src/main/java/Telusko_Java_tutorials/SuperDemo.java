package Telusko_Java_tutorials;

public class SuperDemo {
    public static void main(String[] args) {
        E obj=new E();
        obj.abc();

    }
}
class D{
    int i=5;
//    public D(){
//        System.out.println("In Constr A");
//    }
//    public D(int i){
//        System.out.println("In Constr A Para");
//    }
    public void abc(){
        System.out.println("A abc");
    }
}
class E extends D{
//    public E(){
//        System.out.println("In Constr B");
//    }
//    public E(int a){
//        super(a);
//        System.out.println("In Constr B Para");
//    }
//    int i=4;
//    public void show(){
//        System.out.println(super.i);
//    }
    public void abc(){
        super.abc();
        System.out.println("B abc");
    }
}