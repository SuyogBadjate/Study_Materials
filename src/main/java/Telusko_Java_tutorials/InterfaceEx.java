package Telusko_Java_tutorials;

interface InterfaceE{
    void show();
}
interface Pqr{
    void xyz();
}
//class AbCImpl implements Abc2{
//
//    @Override
//    public void show() {
//        System.out.println("In Abc Impl instantiated..");
//    }
//}
public class InterfaceEx {
    public static void main(String[] args) {
        InterfaceE obj1= () -> System.out.println("In Show");

       obj1.show();
    }
}
