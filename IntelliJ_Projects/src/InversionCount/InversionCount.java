package InversionCount;

import static org.junit.Assert.assertEquals;

public class InversionCount {
    public static int[] inversion_count;
    public static int[] count(int[] A) {
        inversion_count = new int[A.length];
        int[][] temp = new int[A.length][A.length];
        int[][] Arr = new int[A.length][A.length];

        for (int i=0; i<A.length; i++) {
            Arr[i][0] = i;
            Arr[i][1] = A[i];
        }

        sort(Arr, temp, 0, A.length);
        return inversion_count;
    }

    static void merge(int A[][], int temp[][], int p, int q, int r) {
        for (int i = p; i < r; i++)
            temp[i] = A[i];
        int i = p, j = q + 1, k = p;

        while (k < r) {
            if (i > q) {
                A[k++] = temp[j++];
            } else if (j > r - 1) {
                inversion_count[temp[i][0]] += k - i;
                A[k++] = temp[i++];
            } else if (temp[j][1] < temp[i][1]) {
                A[k++] = temp[j++];
            } else {
                inversion_count[temp[i][0]] += k - i;
                A[k++] = temp[i++];
            }
        }
    }

    static void sort(int A[][], int temp[][], int p,int r) {
        if (p < r - 1) {
            int q = p + (r - 1 - p)/2;

            sort(A, temp, p, q+1);
            sort(A, temp, q+1, r);

            merge(A, temp, p, q, r);
        }
        return;
    }
}