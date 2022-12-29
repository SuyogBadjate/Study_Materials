package DSA.Anuj_Bhaiyaa_DSAinOne;

public class RecursionString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba",0,3));
        PowerSet("abc",0," ");
        Permutation("ab",0,1);
    }
    static boolean isPalindrome(String str,int l,int r){
        if(l>=r) {
            return true;
        }
        if(str.charAt(l) != str.charAt(r)){
            return false;
        }
        return isPalindrome(str,l+1,r-1);
    }
    static void PowerSet(String str,int i,String curr){
        if(i==str.length()){
            System.out.println(curr);
            return;
        }
        PowerSet(str,i+1,curr+str.charAt(i));
        PowerSet(str,i+1,curr);
    }
    static String swap(String str,int l,int r){
        char[] b =str.toCharArray();
        char ch;
        ch = b[l];
        b[l] = b[r];
        b[r] = ch;
        return String.valueOf(b);
    }
    static void Permutation(String str,int l,int r){
        if(l==r){
            System.out.println(str);
            return;
        }
        for (int i = l; i <= r; i++) {
            str = swap(str,l,r);
            Permutation(str,l+1,r);


        }
    }
}
