package binary_search;

/**
 * LeetCode Problem #704: Binary Search.
 * Link: <a href="https://leetcode.com/problems/binary-search/">...</a>
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            int n = nums[mid];

            if(n == target){
                return mid;
            }else if(n > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
