package Leetcode_Problems.LEETCODE_PATTERNS;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_Optimized {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
            if(!set.add(i))// if there is same
                return true;
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
