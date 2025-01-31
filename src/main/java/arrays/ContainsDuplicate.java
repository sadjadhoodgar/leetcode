package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Problem #217: Contains Duplicate.
 * Link: <a href="https://leetcode.com/problems/contains-duplicate/">...</a>
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            } else {
                seen.add(num);
            }
        }
        return false;
    }
}
