import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestProduct {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testProduct0() {
        int[] nums = {5, 10, 2, 20};
        int target = 20;
        int[] expected = {1, 2};
        assertArrayEquals(expected, ex.productIndices(nums, target));
    }

    @Test
    void testProduct1() {
        int[] nums = {3, 7, 1, 14};
        int target = 21;
        int[] expected = {0, 1};
        assertArrayEquals(expected, ex.productIndices(nums, target));
    }

    @Test
    void testProduct2() {
        int[] nums = {69, 15, 17, 23, 5, 11, 4, 6, 85, 39, 81, 34, 76, 21, 3, 36, 98, 77, 9, 42};
        int target = 2898;
        int[] expected = {0, 19};
        assertArrayEquals(expected, ex.productIndices(nums, target));
    }
}
