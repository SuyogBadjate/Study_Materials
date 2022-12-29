package Telusko_Java_tutorials;

public class Var_Args {
    public static void main(String[] args) {
       Display obj = new Display();
       obj.show(4,5);
    }
}
class Display{
    public void show(int ... a){
        for (int i:a) {
            System.out.println(i);
        }
    }

}
