package GeeksForGeeksPractice;
public class Counting0TrSpaces {
    // Integer Overflow
    static long trailingZeroes(int N){
            // Write your code here
            long fact=1,count=0;
            while(N>0){
                fact=fact*N;
                N--;
            }
            System.out.println(fact);
            while(fact>0){
                if (fact % 10 == 0 )
                    count++;
                else
                    break;
                fact = fact / 10;
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(200));
    }
}
