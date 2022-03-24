package QuickSelect;
public class QuickSelect {
    static int select(int[] A, int k) {
        return kthsmallest(A, 0, A.length - 1, k+1);
    }

    static int kthsmallest(int A[], int l, int r, int k) {
        if (k > 0 && k <= r - l + 1) {
            int pivot = randomPartition(A, l, r);

            if (pivot - l == k - 1)
                return A[pivot];

            if (pivot - l > k - 1)
                return kthsmallest(A, l, pivot - 1, k);

            return kthsmallest(A, pivot + 1, r,k - pivot + l - 1);
        }

        return Integer.MAX_VALUE;
    }

    static int partition(int[] A, int lo, int hi) {
        int x = A[hi], i = lo;
        for (int j = lo; j <= hi - 1; j++) {
            if (A[j] <= x) {
                swap(A, i, j);
                i++;
            }
        }
        swap(A, i, hi);
        return i;
    }

    static int randomPartition(int A[], int lo, int hi) {
        int n = hi - lo + 1;
        int pivot = (int)(Math.random()) * (n-1);
        swap(A, lo + pivot, hi);
        return partition(A, lo, hi);
    }

    static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}