package BinarySearch2D;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearch2DTest {
    @Test
    public void testBinary2DSimple() {
        int[][] M = {
                {1, 3, 4, 5},
                {5, 6, 7, 7},
                {8, 10, 11, 12},
                {12, 13, 15, 16}
        };
        int q = 5;
        int[] coords = BinarySearch2D.search(M, q);
        assertEquals(M[coords[0]][coords[1]], q);
    }
}