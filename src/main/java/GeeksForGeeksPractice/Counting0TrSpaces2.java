package GeeksForGeeksPractice;
public class Counting0TrSpaces2 {
    //using prime factor check for number with prime factor consists of 5's
    static int trailingZeroes(int N){
        // Write your code here
        if(N<0)
            return -1;
        int count=0;
        for(int i=5;N/i>=1;i*=5)
            count+=N/i;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(200));
    }
}
