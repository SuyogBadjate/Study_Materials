package Telusko_Java_tutorials;

import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
       Class c = Class.forName("Telusko_Java_tutorials.Show");
       Show s =(Show)c.newInstance();

       Method m = c.getDeclaredMethod("show",null);
       m.setAccessible(true);
       m.invoke(s,null);

       Class c1=Class.forName("Telusko_Java_tutorials.A5");
        System.out.println(c1.getSuperclass());

    }
}
class Show{
    private void show(){
        System.out.println("Inside Show");
    }
}

class A5 extends B{

}
class B5{

}