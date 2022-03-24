package HeapSort;

public class HeapSort {
    static void heapify(int A[], int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < n && A[left] > A[largest]) largest = left;
        if (right < n && A[right] > A[largest]) largest = right;
        if (largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            heapify(A, n, largest);
        }
    }
    static void heapSort(int A[]) {
        int n = A.length;

        //Build heap
        for (int i= n/2; i>=0; i--) heapify(A, n, i);
        for (int i= n-1; i>0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            n -= 1;
            heapify(A, n, 0);
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
