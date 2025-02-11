package strings;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Problem #383: Ransom Note.
 * Link: <a href="https://leetcode.com/problems/ransom-note/">...</a>
 */
public class RansomeNote {
    public boolean canConstruct(@NotNull String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for(Character c : ransomNote.toCharArray()){
            map.merge(c, 1, Integer::sum);
        }

        for(Character c : magazine.toCharArray()) {
            if(!map.containsKey(c)){
                map.computeIfPresent(c, (k, v) -> v > 1 ? v - 1 : null);
            }
        }

        return map.isEmpty();
    }
}
