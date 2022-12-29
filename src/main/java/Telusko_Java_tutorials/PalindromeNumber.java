package Telusko_Java_tutorials;
// 121 -> 121
public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121,rem,sum=0;
        int t=n;
        while (n > 0) {
            rem=n%10;
            n=n/10;
            sum = rem+sum*10;
        }
        if(t==sum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome");
    }
}
