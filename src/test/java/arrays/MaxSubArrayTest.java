package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

    MaxSubArray underTest = new MaxSubArray();

    @Test
    public void maxSubArrayTest(){
        assertEquals(6, underTest.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}