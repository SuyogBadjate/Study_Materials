package DSA.Anuj_Bhaiyaa_DSAinOne;

import java.util.*;

public class InterviewBitQn1 {
    public static void main(String[] args) {
        List<Integer> a =  new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(5);
        //System.out.println(singleNumber(a));
        System.out.println(thriceNumber(a));
        //System.out.println(reverse(00000000000000000000000000010101));
    }

    public static HashSet<Integer> singleNumber(final List<Integer> A) {
            //int res=0;
        HashSet<Integer> res=new HashSet<>();
            for(int i=0;i<A.size();i++){
                //res=res^A.get(i);
                if(res.contains(A.get(i))){
                    res.remove(A.get(i));
                }
                else{
                    res.add(A.get(i));
                }
            }
            return res;
    }

    public static HashSet<Integer> twoNumber(final List<Integer> A) {
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<A.size();i++) {
           if(res.contains(A.get(i)))
           {
               res.remove(A.get(i));
           }
           else{
               res.add(A.get(i));
           }
        }
        return res;
    }

    public static int thriceNumber(final List<Integer> A) {
        HashSet<Integer> s=new HashSet<Integer>();
        for (int i:A) {
            s.add(i);
        }
        int set_sum=0;
        for (int i:s) {
            set_sum+=i;
        }
        int arr_sum=0;
        for (int i:A) {
            arr_sum+=i;
        }
        return (3*set_sum-arr_sum)/2;
    }

    public static long reverse(long a) {
        long ans=0;
        for(int i=0;i<32;i++){
                if((a&1)==1){
                    ans=ans+((1<<(32-i)));
                    a=a>>1;
                }
        }
        return ans;
    }


}
