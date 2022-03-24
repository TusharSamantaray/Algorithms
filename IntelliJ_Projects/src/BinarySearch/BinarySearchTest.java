package BinarySearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void SearchOne() {
        int[] A = {1,2,3,4};
        assertEquals(1, BinarySearch.search(A, 2));
    }

    @Test
    public void SearchTwo() {
        int[] A = {1,2,3};
        assertEquals(-1, BinarySearch.search(A,10));
    }
}
