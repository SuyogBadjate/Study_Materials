package DSA.Anuj_Bhaiyaa_DSAinOne;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sumOfN(1));
    }
    static int sumOfN(int n){
        if(n==1)
            return 1;
        return n + sumOfN(n-1);
    }
}
