package arrays;

/**
 * LeetCode Problem #53: Maximum SubArray.
 * Link: <a href="https://leetcode.com/problems/maximum-subarray/">...</a>
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}