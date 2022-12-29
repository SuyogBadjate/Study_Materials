package Telusko_Java_tutorials;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String os() default("Symbian");
    int version() default 1;
}
@SmartPhone(os="Android",version=6)
class NokiaASeries
{
   String model;
   int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}
public class AnnotationDemo2 {
    public static void main(String[] args) {
        NokiaASeries obj=new NokiaASeries("Fire",5);
        Class c=obj.getClass();
        Annotation an=c.getAnnotation(SmartPhone.class);
        SmartPhone s=(SmartPhone) an;
        System.out.println(s.os());
    }
}
