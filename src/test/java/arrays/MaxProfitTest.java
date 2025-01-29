package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    MaxProfit underTest = new MaxProfit();

    @Test
    void maxProfit() {
        assertEquals(5, underTest.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(2, underTest.maxProfit(new int[]{2,4,1}));
        assertEquals(2, underTest.maxProfit(new int[]{2,1,2,1,0,1,2}));
    }

    @Test
    void maxProfit_edge_01() {
        assertEquals(2, underTest.maxProfit(new int[]{2,4,1}));
    }

    @Test
    void maxProfit_edge_02() {
        assertEquals(2, underTest.maxProfit(new int[]{2,1,2,1,0,1,2}));
    }
}