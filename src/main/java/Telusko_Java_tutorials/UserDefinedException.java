package Telusko_Java_tutorials;

public class UserDefinedException {
    public static void main(String[] args) {
        int i=5;
        try {
            if (i < 10) {
                throw new MyException("Error");
            }
        }
        catch(MyException e){
            System.out.println(e);
        }
    }
}
class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}
