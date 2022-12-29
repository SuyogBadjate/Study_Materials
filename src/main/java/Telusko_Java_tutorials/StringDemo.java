package Telusko_Java_tutorials;

public class StringDemo {
    public static void main(String[] args) {
        String str="Navin, Mahesh, Rahul, Vijay";
        String names[] = str.split(",");
        System.out.println(names[2]);

        for (String str1:names){
            System.out.println(str1);
        }
    }
}
