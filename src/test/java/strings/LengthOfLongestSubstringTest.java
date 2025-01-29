package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {
    LengthOfLongestSubstring underTest = new LengthOfLongestSubstring();

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, underTest.lengthOfLongestSubstring("abcabcbb"));
    }
}