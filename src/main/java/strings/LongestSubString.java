package strings;

import java.util.HashSet;
import java.util.Set;


/**
 * LeetCode Problem #3: Longest Substring.
 * Link: <a href="https://leetcode.com/problems/longest-palindromic-substring/">...</a>
 */
public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while (right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                max = Math.max(max, right - left);
            }else{
                set.remove(s.charAt(left++));
            }
        }

        return max;
    }
}
