package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Problem #01: Two Sum
 * Link: <a href="https://leetcode.com/problems/two-sum/">...</a>
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = k - nums[i];

            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }

            map.put(diff, i);
        }

        return new int[]{-1, -1};
    }
}
