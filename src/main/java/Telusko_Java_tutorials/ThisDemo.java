package Telusko_Java_tutorials;

public class ThisDemo {
    public static void main(String[] args) {
        AA6 obj=new AA6(6);
        obj.show();
    }
}
class AA6{
    private int x;
    public AA6(int x){
        this.x=x;
    }
    public void show(){
        System.out.println(x);
    }
}