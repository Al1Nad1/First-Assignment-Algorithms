import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTraversal {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testTraverse0() {
        int[][] nums = {
                {1, 2, 3, 4, 5}
        };
        int rows = 1;
        int cols = 5;
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, ex.spiralTraversal(nums, rows, cols));
    }

    @Test
    void testTraverse1() {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int rows = 4;
        int cols = 3;
        int[] expected = {1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8};
        assertArrayEquals(expected, ex.spiralTraversal(nums, rows, cols));
    }

    @Test
    void testTraverse2() {
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        int rows = 2;
        int cols = 4;
        int[] expected = {1, 2, 3, 4, 8, 7, 6, 5};
        assertArrayEquals(expected, ex.spiralTraversal(nums, rows, cols));
    }

    @Test
    void testTraverse3() {
        int[][] nums = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30}
        };
        int rows = 5;
        int cols = 6;
        int[] expected = {1, 2, 3, 4, 5, 6, 12, 18, 24, 30, 29, 28, 27, 26, 25, 19, 13, 7, 8, 9, 10, 11, 17, 23, 22, 21,
                20, 14, 15, 16};
        assertArrayEquals(expected, ex.spiralTraversal(nums, rows, cols));
    }
}
