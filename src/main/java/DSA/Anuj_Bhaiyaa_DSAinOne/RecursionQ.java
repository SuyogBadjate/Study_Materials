package DSA.Anuj_Bhaiyaa_DSAinOne;

public class RecursionQ {
    public static void main(String[] args) {
        System.out.println(powerR(25,4, 1000000007));

    }

    static long powerR(long a,long b,long n){
        if(b==0) {
                return 1;
            }


        return (powerR(a, b - 1,1000000007) * a % n)%n;

    }
}
