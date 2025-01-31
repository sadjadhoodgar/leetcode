package stack;

import java.util.*;

/**
 * LeetCode Problem #20: Valid Parentheses.
 * Link: <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Set<Character> set = new HashSet<>(map.values());

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                deque.push(c);
            }
            else if (set.contains(c)){
                if(deque.isEmpty()){
                    return false;
                }

                char x = deque.pop();

                if(map.get(x) != c){
                    return false;
                }
            }
        }

        return deque.isEmpty();
    }
}
