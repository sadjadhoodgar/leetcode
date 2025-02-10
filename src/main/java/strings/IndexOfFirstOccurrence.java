package strings;

/**
 * LeetCode Problem #28: Find The Index Of The First Occurrence In a String
 * Link: <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">...</a>
 */
public class IndexOfFirstOccurrence {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if(haystack.isEmpty() || needle.isEmpty() || n < m || (n == m && !haystack.equals(needle))){
            return -1;
        }

        if(n == m){
            return 0;
        }

        int left = 0;
        int right = needle.length();

        while (right < haystack.length() + 1){
            if(haystack.substring(left, right).equals(needle)){
                return left;
            }else{
                left++;
                right++;
            }
        }

        return -1;
    }
}
