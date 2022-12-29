package Telusko_Java_tutorials;
// 153 - 1 5 3 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 155;
        int temp = n;
        int rem,sum=0;
        while(temp>0){
            rem=temp%10;
            temp = temp/10;
            sum = sum + rem * rem * rem;
        }
        if(n==sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}
