package Telusko_Java_tutorials;
// 6 -> 1+2+3 = 6
// 28 -> 1+2+4+7+14 = 28
public class PerfectNumber {

    public static boolean isPerfect(int n){
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0)
                sum += i;
        }
        return (n==sum)?true:false;
    }
    public static void main(String[] args) {
        int n=6;
        boolean b=isPerfect(n);
        if(b)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}
