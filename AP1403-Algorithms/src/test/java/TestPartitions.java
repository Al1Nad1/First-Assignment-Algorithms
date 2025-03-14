import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestPartitions {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testPartition0() {
        int[][] expected = {
                {1}
        };
        assertArrayEquals(expected, Exercises.intPartitions(1));
    }

    @Test
    void testPartition1() {
        int[][] expected = {
                {4},
                {3, 1},
                {2, 2},
                {2, 1, 1},
                {1, 1, 1, 1}
        };
        assertArrayEquals(expected, ex.intPartitions(4));
    }

    @Test
    void testPartition2() {
        int[][] expected = {
                {5},
                {4, 1},
                {3, 2},
                {3, 1, 1},
                {2, 2, 1},
                {2, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        assertArrayEquals(expected, ex.intPartitions(5));
    }

    @Test
    void testPartition3() {
        int[][] expected = {
                {6},
                {5, 1},
                {4, 2},
                {4, 1, 1},
                {3, 3},
                {3, 2, 1},
                {3, 1, 1, 1},
                {2, 2, 2},
                {2, 2, 1, 1},
                {2, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };
        assertArrayEquals(expected, ex.intPartitions(6));
    }
}
