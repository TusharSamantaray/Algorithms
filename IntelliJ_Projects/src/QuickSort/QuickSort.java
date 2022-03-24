package QuickSort;
import org.jetbrains.annotations.Contract;

import java.lang.*;

public class QuickSort {
    static int partition(int A[], int p, int r) {
        int pivot = A[p];
        int i = p - 1;
        int j = r;

        while (true) {
            do {
                i = i + 1;
            } while (A[i] < pivot);
            do {
                j = j - 1;
            } while (A[j] > pivot);

            if (i >= j)
                return j;
            A = swap(A, i, j);
        }
    }

    @Contract("_, _, _ -> param1")
    private static int[] swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        return A;
    }

    static void sort(int A[], int p, int r) {
        if (p < r - 1) {
            int q = partition(A, p, r);
            sort(A, p, q+1);
            sort(A, q+1, r);
        }
    }

    public static Boolean sorted(int A[], int begin, int end) {
        for (int i = begin; i != end; ++i) {
            if (i + 1 != end) {
                if (A[i] > A[i+1]) return false;
            }
        }
        return true;
    }
}
