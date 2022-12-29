package Telusko_Java_tutorials;

public class InnerDemo {
    public static void main(String[] args) {
        //A7 obj=new A7();
        //A7.B7 obj1=obj.new B7();
//        A7.B7 obj1=new A7.B7();
//        obj1.show();
        B7 obj1= () -> System.out.println("Hi");
        obj1.show();
    }
}
//class A7{
//    int rollno;
//    String sname;
//
////    static class B7 {
////        public void show() {
////            System.out.println("Hello");
////        }
////    }
//}

@FunctionalInterface
    interface B7 {
        void show();
    }
