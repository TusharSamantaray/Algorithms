package MajorityElement;

import QuickSelect.QuickSelect;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTest {
    @Test
    public void MajorityElement_Test1() {
        int[] A = {2, 2, 2, 2, 3, 4, 1, 5, 2};
        assertEquals(MajorityElement.majority(A), 2);
    }

    @Test
    public void MajorityElement_Test2() {
        int[] A = {2, 2, 3, 4, 1, 5};
        assertEquals(MajorityElement.majority(A), -1);
    }
}
