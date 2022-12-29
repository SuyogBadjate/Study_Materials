package Leetcode_Problems.LEETCODE_PATTERNS;

public class Missing_Number {
    public static int missingNumber(int[] nums) {
        int sum = 0,n=nums.length;

        for(int num: nums)
            sum += num;

        return n * (n+1)/2 - sum;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,4,2};
        System.out.println(missingNumber(nums));
    }
}
