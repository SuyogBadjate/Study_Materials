package Telusko_Java_tutorials;

public class CloningDemo {
    /*
    1) Shallow
    2) Deep
    3) Clone
     */
    public static void main(String[] args) throws CloneNotSupportedException{
        ABC5 obj=new ABC5();
        obj.i=5;
        obj.j=6;

        ABC5 obj1=(ABC5) obj.clone();

        obj1.j=8;
        System.out.println(obj);
        System.out.println(obj1);
    }
}
class ABC5 implements Cloneable{
    int i;
    int j;

    @Override
    public String toString() {
        return "ABC5{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}