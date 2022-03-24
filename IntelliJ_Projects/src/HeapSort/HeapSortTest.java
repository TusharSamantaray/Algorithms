package HeapSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeapSortTest {
    @Test
    public void Test1() {
        int A[] = {12, 11, 13, 5, 6, 7};
        (new HeapSort()).heapSort(A);
        assertEquals(HeapSort.sorted(A, 0, A.length), true);
    }

    @Test
    public void Test2() {
        int A[] = {5, 2, 4, 6, 1, 3};
        (new HeapSort()).heapSort(A);
        assertEquals(HeapSort.sorted(A, 0, A.length), true);
    }
}
