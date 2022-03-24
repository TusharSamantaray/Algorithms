package Scheduling;

import org.junit.Test;
import static org.junit.Assert.*;

public class SchedulingTest {
    @Test
    public void Test1() {
        int[][] A = {{64800,21600}, {75600,14400}, {10800,50400}, {46800, 68400}};
        int ans = 2;
        assertEquals((new Scheduling()).schedule(A), ans);
    }
    @Test
    public void Test2() {
        int[][] A = {{64800,21600}, {75600,14400}, {10800,50400}, {46800, 68400}, {103421, 4532}};
        int ans = 3;
        assertEquals((new Scheduling()).schedule(A), ans);
    }
}


//if (A[i][0] > A[i][1])