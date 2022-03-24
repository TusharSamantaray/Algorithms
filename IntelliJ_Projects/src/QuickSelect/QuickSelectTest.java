package QuickSelect;

import static org.junit.Assert.*;
import org.junit.Test;

public class QuickSelectTest {

    @Test
    public void SelectTest_1() {
        int[] A = {2, 5, 6, 4, 3, 0};
        assertEquals(QuickSelect.select(A, 0), 0);
    }

    @Test
    public void SelectTest_2() {
        int[] A = {2, 5, 6, 4, 3, 0};
        assertEquals(QuickSelect.select(A, 1), 2);

    }

    @Test
    public void SelectTest_3() {
        int[] A = {2, 5, 6, 4, 3, 0};
        assertEquals(QuickSelect.select(A, 2), 3);
    }

    @Test
    public void SelectTest_4() {
        int[] A = {2, 5, 6, 4, 3, 0};
        assertEquals(QuickSelect.select(A, 3), 4);
    }

    @Test
    public void SelectTest_5() {
        int[] A = {2, 5, 6, 4, 3, 0};
        assertEquals(QuickSelect.select(A, 4), 5);
    }

    @Test
    public void SelectTest_6() {
        int[] A = {2, 5, 6, 4, 3, 0};
        assertEquals(QuickSelect.select(A, 5), 6);
    }
}