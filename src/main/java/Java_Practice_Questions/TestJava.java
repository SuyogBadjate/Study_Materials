package Java_Practice_Questions; /******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anyw********************************************/
import java.util.*;
public class TestJava
{
    public static void minOp(int N, List<Integer> A){
        long count=0;
        int X=12;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<N;i++){
            res.add(A.get(i)^X);
        }
//        for(int a: res){
//            System.out.println(a);
//        }

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(res.get(i)>res.get(j) && i<j){
                    Collections.swap(res,i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        lst.add(0);
        lst.add(8);
        lst.add(2);
        lst.add(4);
        minOp(4,lst);


    }
}
