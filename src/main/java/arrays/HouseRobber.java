package arrays;

/**
 * LeetCode Problem #198: House Robber.
 * Link: <a href="https://leetcode.com/problems/house-robber/">...</a>
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        int prev1 = Math.max(nums[0], nums[1]);
        int prev2 = nums[0];

        for (int i = 2; i < nums.length; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
