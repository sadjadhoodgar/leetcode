package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    void longestPalindrome() {
        assertEquals("aba", longestPalindrome.longestPalindrome("babad"));
    }
}