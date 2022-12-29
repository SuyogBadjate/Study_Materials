package Telusko_Java_tutorials;

import java.util.ArrayList;
@FunctionalInterface
interface ABC8{
    void show();
}
class A8{
    public void show(){
        System.out.println("in A");
    }
}
class B8 extends A8{
    @Deprecated
    public void showOld(){

    }
    @Override
    @SuppressWarnings("unchekced")
    public void show(){
        ArrayList obj=new ArrayList();
        System.out.println("in B");
    }
}
public class AnnotationDemo {
    public static void main(String[] args) {
        B8 obj=new B8();
        obj.show();
    }
}
