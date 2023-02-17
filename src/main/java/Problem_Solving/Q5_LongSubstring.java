//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving;

public class Q5_LongSubstring {

    public static void main(String[] args) {
        String s = "abcaaccabf";
        int temp = 0;
        String ans = "";
        char[] var4 = s.toCharArray();
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            char c = var4[var6];
            String comp = String.valueOf(c);
            if (!ans.contains(comp)) {
                ans = ans + comp;
                temp = Math.max(temp, ans.length());
            } else {
                ans = ans.substring(ans.indexOf(comp) + 1, ans.length()) + comp;
            }
        }

        System.out.println(temp);
    }
}
