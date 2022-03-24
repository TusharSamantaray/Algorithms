package InsertionSort;

import org.junit.Assert;

public class InsertionSortTest {
    @org.junit.Test
    public void InsertionSort_test() {
        int[] A = new int[]{5, 2, 4, 6, 1, 3};
        //assertTrue(InsertionSort.InsertionSort.sorted(InsertionSort.InsertionSort.sort(A), 0, 5));
        A = InsertionSort.sort(A);
        Assert.assertEquals(InsertionSort.sorted(A, 0, A.length), true);
    }
}
