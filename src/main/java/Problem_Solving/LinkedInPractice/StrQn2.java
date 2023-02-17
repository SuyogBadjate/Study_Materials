//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving.LinkedInPractice;

public class StrQn2 {

    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }

    static String reverseWords(String S) {
        String[] res = S.split("\\.");
        StringBuilder sb = new StringBuilder();

        for(int i = res.length - 1; i >= 0; --i) {
            sb.append(res[i]);
            if (i > 0) {
                sb.append(".");
            }
        }

        return sb.toString();
    }
}
