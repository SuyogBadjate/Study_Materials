package FrazDSA;
import java.util.*;

public class PermutationSoln {
    private static void permute(ArrayList<String> ans, String str, int curr, int n)
    {
        if (curr == n)
            ans.add(str);
        else
        {
            for (int i = curr; i < n; i++)
            {
                str = swap(str,curr,i);
                permute(ans, str, curr+1, n);
                str = swap(str,curr,i);
            }
        }
    }
    public static String swap(String s, int i, int j)
    {
        char temp;
        char[] strArray = s.toCharArray();
        temp = strArray[i] ;
        strArray[i] = strArray[j];
        strArray[j] = temp;
        return String.valueOf(strArray);
    }

    public static void main(String[] args) {
        // Write your code here
        String str = "ABC";
        ArrayList<String> ans = new ArrayList<>();
        int n = str.length();
        permute(ans, str, 0, n);
        Collections.sort(ans);
        System.out.println(ans);
    }
}