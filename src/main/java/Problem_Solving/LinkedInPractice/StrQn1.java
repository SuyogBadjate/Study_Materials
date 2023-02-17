//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving.LinkedInPractice;

import java.io.IOException;
import java.util.ArrayList;

class StrQn1 {

    public static void main(String[] args) throws IOException {
        System.out.println(longestSubstrDistinctChars("geeksforgeeks"));
    }

    static int longestSubstrDistinctChars(String S) {
        ArrayList<Character> chars = new ArrayList();
        int r = 0;
        int max = 0;

        while(r < S.length()) {
            if (chars.contains(S.charAt(r))) {
                max = Math.max(max, chars.size());
                System.out.println(chars.get(0));
                chars.remove(0);
            } else {
                chars.add(S.charAt(r));
                ++r;
            }
        }

        max = Math.max(max, chars.size());
        return max;
    }
}
