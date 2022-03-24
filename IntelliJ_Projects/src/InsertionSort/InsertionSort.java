package InsertionSort;

public class InsertionSort {
    public static int[] sort(int A[]) {
        if (A.length > 1) {
            for (int j = 1; j < A.length; j++) {
                int key = A[j];
                int i = j - 1;
                //assertEquals(InsertionSort.InsertionSort.sorted( A, 0, A.length), true);
                while (i >= 0 && A[i] > key) {
                    A[i+1] = A[i];
                    i = i - 1;
                }
                A[i+1] = key;
            }
        }
        return A;
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