package HuffmanCoding;
import java.util.*;

public class HuffmanCoding {
    static class Node {
        Character ch;
        Integer frequency;
        Node left = null, right = null;

        Node(Character ch, Integer frequency) {
            this.ch = ch;
            this.frequency = frequency;
        }

        public Node(Character ch, Integer frequency, Node left, Node right) {
            this.ch = ch;
            this.frequency = frequency;
            this.left = left;
            this.right = right;
        }
    }

    public static Object build(String text) {
        //Count the frequency of each character and store
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : text.toCharArray()) frequency.put(c, frequency.getOrDefault(c, 0) + 1);

        //Store live nodes of the huffman tree using a priority queue.
        PriorityQueue<Node> dic;
        dic = new PriorityQueue<>(Comparator.comparingInt(i -> i.frequency));

        //Create a leaf node in the priority queue for each character
        for (var c : frequency.entrySet()) dic.add(new Node(c.getKey(), c.getValue()));

        while (dic.size() != 1) {
            Node left = dic.poll();
            Node right = dic.poll();

            int sum = left.frequency + right.frequency;
            dic.add(new Node(null, sum, left, right));
        }
        return dic;
    }

    public static String encode(Object dic, String text) {
        Map<Character, String> huffmanCode = new HashMap<>();

        PriorityQueue<Node> p = new PriorityQueue<>((PriorityQueue) dic);
        Node node = p.peek();

        encoder(node, "", huffmanCode);

        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) sb.append(huffmanCode.get(c));

        return sb.toString();
    }

    public static void encoder(Node node, String str, Map<Character, String> huffmanCode) {
        if (node == null) return;
        if (node.left == null && node.right == null) huffmanCode.put(node.ch, str.length() > 0 ? str : "1");

        encoder(node.left, str + '0', huffmanCode);
        encoder(node.right, str + '1', huffmanCode);
    }

    public static String decode(Object dic, String text) {
        PriorityQueue<Node> p = new PriorityQueue<>((PriorityQueue) dic);
        StringBuilder result = new StringBuilder();
        Node node = p.peek();

        if (node.left == null && node.right == null) {
            while (node.frequency-- > 0) result.append(node.ch);
        } else {
            int index = -1;
            while (index < text.length() - 1) {
                index = decoder(node, index, text, result);
            }
        }
        return result.toString();
    }

    public static int decoder(Node node, int index, String text, StringBuilder result) {
        if (node == null) return index;
        if (node.left == null && node.right == null) {
            result.append(node.ch);
            return index;
        }
        index++;
        node = (text.charAt(index) == '0') ? node.left : node.right;
        index = decoder(node, index, text, result);
        return index;
    }
}
