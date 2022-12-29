package Telusko_Java_tutorials;
enum Mobile{
    APPLE(100),SAMSUNG,HTC(90);
    int price;
    Mobile(){
        price=80;
        System.out.println("Constructor");
    }
    Mobile(int i){
        price=i;
    }
    public int getPrice(){
        return price;
    }
}
public class EnumDemo {
    public static void main(String[] args) {
        Mobile m=Mobile.SAMSUNG;
        System.out.println(Mobile.APPLE.getPrice());
//        switch(m){
//            case APPLE:
//                System.out.println("Matched Apple best");
//                break;
//            case SAMSUNG:
//                System.out.println("Matched Samsung best");
//                break;
//
//        }
    }
}
