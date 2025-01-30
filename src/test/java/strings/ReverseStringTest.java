package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class ReverseStringTest {

    ReverseString underTest = new ReverseString();

    @Test
    void reverseString() {
        char[] input1 = {'h', 'e', 'l', 'l', 'o'};
        char[] expected1 = {'o', 'l', 'l', 'e', 'h'};
        underTest.reverseString(input1);
        assertArrayEquals(expected1, input1);
    }
}