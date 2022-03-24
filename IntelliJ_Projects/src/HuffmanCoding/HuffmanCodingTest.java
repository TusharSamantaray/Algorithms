package HuffmanCoding;
import org.junit.Test;
import static org.junit.Assert.*;

public class HuffmanCodingTest {
    @Test
    public void Test1() {
        String text = "Hello";
        Object dic = HuffmanCoding.build(text);
        String etext = HuffmanCoding.encode(dic, text);
        int ans = 10;
        System.out.println(etext);
        assertEquals(ans, etext.length());
        assertEquals(text, HuffmanCoding.decode(dic, etext));
    }

    @Test
    public void Test2() {
        String text = "Encode phrase with entire alphabet on tree with rotations on non-existent nodes";
        Object dic = HuffmanCoding.build(text);
        String etext = HuffmanCoding.encode(dic, text);
        String desiredOutputString = "0000001011010111101001011001001001110011001001000110010111111010100111000111000111011010100110011100100110101000010100010000001001010110100000110001011101011001101110100010101110101111101001001101000110001111100101101001110101010010010001110101001100111001001101001011000001100111000110100001101110001101101111010";
        int ans = 303;
        System.out.println((etext));
        assertEquals(ans, etext.length());
        assertEquals(text, HuffmanCoding.decode(dic, etext));
    }

    @Test
    public void Test3() {
        String text = "";
        Object dic = HuffmanCoding.build(text);
        String etext = HuffmanCoding.encode(dic, text);
        int ans = 0;
        assertEquals(ans, etext.length());
        assertEquals(text, HuffmanCoding.decode(dic, etext));
    }
}
