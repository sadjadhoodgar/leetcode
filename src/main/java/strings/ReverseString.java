package strings;

/**
 * LeetCode Problem #344: Reverse String
 * Link: <a href="https://leetcode.com/problems/reverse-string/">...</a>
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        for(int i = 0; i < s.length / 2; i ++){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
