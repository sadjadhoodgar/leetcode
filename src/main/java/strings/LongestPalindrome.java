package strings;

/**
 * LeetCode Problem #5: Longest Substring Palindromic Substring
 * Link: <a href="https://leetcode.com/problems/longest-palindromic-substring/">...</a>
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindromes (single character center)
            int len1 = expandAroundCenter(s, i, i);
            // Even-length palindromes (two-character center)
            int len2 = expandAroundCenter(s, i, i + 1);

            int maxLen = Math.max(len1, len2);

            // Update the start and end indices if we found a longer palindrome
            if (maxLen > (end - start)) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
