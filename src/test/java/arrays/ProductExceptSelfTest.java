package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    ProductExceptSelf underTest = new ProductExceptSelf();

    @Test
    void productExceptSelf() {
        assertArrayEquals(new int[]{24,12,8,6}, underTest.productExceptSelf(new int[]{1,2,3,4}));
    }
}