package Leetcode_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_Optimized {


    public static int[] twoSum(int[] nums, int target) {
            int[] ans=new int[2];
            Map<Integer,Integer> answer=new HashMap<>();
            for(int i=0;i<nums.length;i++) {
                if(answer.containsKey(target-nums[i])){
                    ans[1]=i;
                    ans[0]=answer.get(target-nums[i]);
                    return ans;
                }
                answer.put(nums[i],i);
            }

            return ans;
    }

    public static void main(String[] args) {
        int[] nums= {3,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}
