package DSA.Anuj_Bhaiyaa_DSAinOne;

public class Odd_Even {
    public static void main(String[] args) {
        System.out.println(checkOddEven(88));


        swapNo(50,20);
    }
    static String checkOddEven(int n){
        if((n&1)==1){
            return "Odd";
        }
        else{
            return "Even";
        }

    }
    static void swapNo(int a, int b){
        System.out.println("Values Before Swap "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Values After Swap "+a+" "+b);
    }
}
