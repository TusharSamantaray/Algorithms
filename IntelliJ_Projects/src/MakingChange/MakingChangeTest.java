package MakingChange;
import org.junit.Test;
import static org.junit.Assert.*;

public class MakingChangeTest {
    @Test
    public void Test1() {
        int coins[] = {9, 6, 5, 1};
        int money = 11;
        int res = 2;

        assertEquals((new MakingChange()).minimumCoins(money, coins), res);
    }
}
