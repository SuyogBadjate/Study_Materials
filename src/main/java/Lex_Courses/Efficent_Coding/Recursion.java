package Lex_Courses.Efficent_Coding;

public class Recursion {
    public static void main(String[] args) {
        int d=recursive_sum(5);
        System.out.println(d);
    }
    static int recursive_sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+recursive_sum(n-1);
        }
    }
    static int iterative_sum(int n){
        int sum=0;
        while(n!=0){
            sum+=n;
            n--;
        }
        return sum;
    }
    static int sum(int n){
        return n*(n+1)/2;
    }

}

