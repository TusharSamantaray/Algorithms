package Scheduling;
import java.util.*;

public class Scheduling {
    public static int schedule(int[][] A) {
        //Sort the jobs according to their end time
        Arrays.sort(A, Comparator.comparingInt(x -> x[1]));
        int number_of_jobs = 1; //Always select the first job
        int start_prev = A[0][0], end_prev = A[0][1];

        for (int j = 1; j < A.length; j++) {
            if (A[j][0] > A[j][1]) continue;
            if (start_prev < end_prev && A[j][0] >= end_prev) {
                number_of_jobs++;
                start_prev = A[j][0];
                end_prev = A[j][1];
            }
            if (start_prev > end_prev) {
                if (A[j][0] >= end_prev && A[j][1] <= start_prev) {
                    number_of_jobs++;
                    start_prev = A[j][0];
                    end_prev = A[j][1];
                }
            }
        }
        return number_of_jobs;
    }
}
