package BreadthFirstSearch;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class BreadthFirstSearchTest {
    @Test
    public void Test1() {
        List<List<Integer>> edges = new ArrayList<List<Integer>> ();
        List<Integer> edge = new ArrayList<> ();
        edge.add(0);
        edge.add(3);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(1);
        edge.add(2);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(0);
        edge.add(1);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(1);
        edge.add(3);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(3);
        edge.add(5);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(2);
        edge.add(5);
        edges.add(edge);
        int vertices = 6;
        int[] answer = {0, 1, 2, 1, -1, 3};

        int[] result = BreadthFirstSearch.breadthFirstSearch(edges, vertices);
        assertEquals(result, answer);
    }
}
