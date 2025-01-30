package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    ContainsDuplicate underTest = new ContainsDuplicate();

    @Test
    void containsDuplicate_true() {
        assertTrue(underTest.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void containsDuplicate_false() {
        assertFalse(underTest.containsDuplicate(new int[]{1,2,3,4}));
    }
}