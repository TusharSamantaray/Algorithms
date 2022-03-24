package QuickSort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {
    @Test
    public void testMQuickSort_1() {
        int A[] = {12, 11, 13, 5, 6, 7};
        print_array(A);
        assertEquals(QuickSort.sorted(A, 0, A.length), false);
        QuickSort qs = new QuickSort();
        qs.sort(A, 0, A.length);

        print_array(A);

        assertEquals(QuickSort.sorted(A, 0, A.length), true);
    }

    public void print_array(int A[]) {
        for (int i = 0;i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
