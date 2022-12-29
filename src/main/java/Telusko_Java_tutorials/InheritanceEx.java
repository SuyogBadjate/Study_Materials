package Telusko_Java_tutorials;

public class InheritanceEx {
    public static void main(String[] args) {
        B obj=new B();

    }
}
class A4{
    public A4(){
        System.out.println("In a Constr");
    }
    public A4(int i){
        System.out.println("In a Constr Int");
    }
}

class B extends A4{
    public B(){
        System.out.println("In B Constr");
    }
    public B(int a){
        System.out.println("In B Constr int");
    }
}
