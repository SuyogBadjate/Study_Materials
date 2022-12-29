package DSA.Anuj_Bhaiyaa_DSAinOne;

public class BitsQn {
    public static void main(String[] args) {
        System.out.println(bitsToConvertAToBOp(13,6));
    }
    static int bitsToConvertAToBOp(int a,int b){
        int res=a^b,count=0;
        while(res>0){
            res=res&(res-1);
            count++;
        }
        return count;
    }
    static int bitsToConvertAToB(int a,int b){
        int res=a^b,count=0;
        if((res<<1)==1){
            count++;
        }
        return count;
    }
}
