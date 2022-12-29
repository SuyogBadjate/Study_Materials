package DSA.Anuj_Bhaiyaa_DSAinOne;

public class RecursionQ3 {
    public static void main(String[] args) {
        System.out.println(josephsProblem(5,3));
    }
    static int josephsProblem(int n,int k){
        if(n==1) return 0;
        return (josephsProblem(n-1,k)+k)%n;
    }
}
