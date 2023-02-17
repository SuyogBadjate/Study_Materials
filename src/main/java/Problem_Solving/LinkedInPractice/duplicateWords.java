//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving.LinkedInPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class duplicateWords {

    public static void main(String[] args) {
        String s1 = "It it is is the the new learning";
        System.out.println(duplicateWordsStr(s1));
    }

    static String duplicateWordsStr(String s) {
        String res = "";
        s = s.toLowerCase();
        LinkedHashSet<String> set = new LinkedHashSet(Arrays.asList(s.split(" ")));

        String s1;
        for(Iterator var3 = set.iterator(); var3.hasNext(); res = res + s1 + " ") {
            s1 = (String)var3.next();
        }

        return res;
    }
}
