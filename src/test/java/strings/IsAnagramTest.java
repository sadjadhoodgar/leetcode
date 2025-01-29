package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsAnagramTest {
    IsAnagram underTest = new IsAnagram();

    @Test
    void isAnagram() {
        assertTrue(underTest.isAnagram("anagram", "ramanag"));
    }
}