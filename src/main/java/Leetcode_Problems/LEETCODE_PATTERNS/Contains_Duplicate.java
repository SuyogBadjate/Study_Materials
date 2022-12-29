package Leetcode_Problems.LEETCODE_PATTERNS;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public  static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer t : nums) {
            set.add(t);
        }
        return nums.length != set.size();
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
