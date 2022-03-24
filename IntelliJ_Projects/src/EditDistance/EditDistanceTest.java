package EditDistance;

import BinarySearch.BinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class EditDistanceTest {
    @Test
    public void Test1() {
        String word1 = "hello";
        String word2 = "hellow";
        assertEquals(1, EditDistance.editDistance(word1, word2));
    }

    @Test
    public void Test2() {
        String word1 = "Pokemon";
        String word2 = "Digimon";
        assertEquals(4, EditDistance.editDistance(word1, word2));
    }

    @Test
    public void Test3() {
        String word1 = "Pokemon";
        String word2 = "";
        assertEquals(7, EditDistance.editDistance(word1, word2));
    }

    @Test
    public void Test4() {
        String word1 = "";
        String word2 = "Paranoid";
        assertEquals(8, EditDistance.editDistance(word1, word2));
    }
}
