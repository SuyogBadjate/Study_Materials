package DSA.Anuj_Bhaiyaa_DSAinOne;

public class Mathematics_Qn {
    public static void main(String[] args) {
        System.out.println(fact(12));
        System.out.println(trailingZeroes(30));
        System.out.println(palindrome(363));
    }
    public static int fact(int num){
        int fact=1;
        if(num==0 | num==1){
            fact=1;
        }else if(num>0){
            fact=num*fact(num-1);
        }
        return fact;
    }

    public static int trailingZeroes(int num){
        int res=0;
        for (int i = 5; i <=num ; i=i*5) {
            res = res+num/i;
        }
        return res;
    }

    public static String palindrome(int num){
        int res=0,rem,original=num;
        while(num>0) {
            rem=num%10;
            res = res*10+rem;
            num = num/10;
        }
        return res==original?"Palindrome":"Not a Palindrome";
    }
}
