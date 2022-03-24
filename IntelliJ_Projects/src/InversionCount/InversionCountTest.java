package InversionCount;
import org.junit.Test;
import static org.junit.Assert.*;

public class InversionCountTest {
    @Test
    public void Test1() {
        int[] A = {5,4,7,9,2};
        int[] ans = {2,1,1,1,0};

        int[] result = (new InversionCount()).count(A);
        for (int i = 0; i<result.length; i++)
            System.out.print(result[i]);
        assertArrayEquals(result, ans);
    }
}