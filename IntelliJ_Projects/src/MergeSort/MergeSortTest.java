package MergeSort;
import static org.junit.Assert.*;
import org.junit.Test;

public class MergeSortTest {
    @Test
    public void testMergeSort_1() {
        int A[] = {12, 11, 13, 5, 6, 7};
        print_array(A);
        assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }
    @Test
    public void testMergeSort_2() {
        int A[] = {5, 5, 5, 5, 5, 0};

        assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }
    @Test
    public void testMergeSort_3() {
        int A[] = {12, 12, 23, 4 , 6, 6, 10, -35, 28}; //duplicate elements

        assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }
    @Test
    public void testMergeSort_4() {
        int A[] = {12, 12, 12, 12, 12}; //Same element

        //assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }
    @Test
    public void testMergeSort_5() {
        int A[] = {4, 6, 10, 12, 15, 23, 28, 35}; //already sorted array

        //assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }
    @Test
    public void testMergeSort_6() {
        int A[] = {12, 4}; // two elements

        assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }
    @Test
    public void testMergeSort_7() {
        int A[] = {4}; // two elements

        //assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }
    @Test
    public void testMergeSort_8() {
        //int A[] = {35, 28, 23, 15, 12, 10, 6, 4}; //descending sorted array input
        int A[] = {1 ,8 ,5, 7, 3};

        assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }
    @Test
    public void testMergeSort_9() {
        int A[] = {12, 15, 23, 4 , 6, 10, 35}; //odd length array

        assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }
    @Test
    public void testMergeSort_10() {
        int A[] = {12, 15, 23, 4 , 6, 10, 35, 28, 100, 130, 500, 1000, 235, 554, 75, 345, 800, 222, 333, 888, 444, 111, 666, 777, 60};//large list of elements

        assertEquals(MergeSort.sorted(A, 0, A.length), false);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length);

        print_array(A);

        assertEquals(MergeSort.sorted(A, 0, A.length), true);
    }

    public void print_array(int A[]) {
        for (int i = 0;i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
