package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    TwoSum underTest = new TwoSum();

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, underTest.twoSum(new int[]{2, 7, 9, 6, 45}, 9));
    }
}