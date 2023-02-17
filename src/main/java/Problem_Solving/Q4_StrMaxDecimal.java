//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving;

public class Q4_StrMaxDecimal {

    public static void main(String[] args) {
        String s1 = "3321";
        String d = "1";
        int digit = 0;

        for(int i = 0; i < s1.length(); ++i) {
            char[] str1 = s1.toCharArray();
            char[] str2 = d.toCharArray();
            if (str1[i] == str2[0]) {
                String ans = s1.substring(0, i) + s1.substring(i + 1, str1.length);
                if (digit < Integer.parseInt(ans)) {
                    digit = Integer.parseInt(ans);
                }
            }
        }

        System.out.println(digit);
    }
}
