package strings;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * LeetCode Problem #242: Valid Anagram
 * Link: <a href="https://leetcode.com/problems/valid-anagram/">...</a>
 */
public class IsAnagram {
    public boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        Map<Character, Integer> map = s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));

        for (char c : s2.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0){
                return false;
            }

            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
