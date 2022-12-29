package Telusko_Java_tutorials;
import static java.lang.System.out;
public class StaticBlock {
    static String s="";
    static{
        s="Hello World";
    }
    public static void main(String[] args) {
        out.println("The value for s is: "+s);
    }
}
