package MergeSort;
import static org.junit.Assert.*;

public class MergeSort {
    static void merge(int A[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - 1 - q;

        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];

        for(int i=0; i<n1; ++i)
            L[i] = A[p+i];
        for(int i=0; i<n2; ++i)
            R[i] = A[q+1+i];

        L[n1] = R[n2] = Integer.MAX_VALUE; //Assign a high value to the last element of the split arrays

        int i=0, j=0, k = p;

        while (k < r) {
            assertEquals(sorted(A, p, k), true);
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        assertEquals(sorted(A, p, k), true);
    }

    static void sort(int A[],int p,int r) {
        if (p < r - 1) {
            int q = p + (r - 1 - p)/2;

            sort(A, p, q+1);
            sort(A,q+1, r);

            merge(A, p, q, r);
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