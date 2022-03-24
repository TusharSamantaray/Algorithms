package Dijkstra;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;


public class DikjstraTest {
    @Test
    public void Test1() {
        List<List<Integer>> edges = new ArrayList<List<Integer>> ();
        List<Integer> edge = new ArrayList<> ();
        edge.add(0);
        edge.add(1);
        edge.add(4);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(0);
        edge.add(2);
        edge.add(2);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(1);
        edge.add(3);
        edge.add(2);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(1);
        edge.add(4);
        edge.add(3);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(2);
        edge.add(1);
        edge.add(1);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(2);
        edge.add(3);
        edge.add(2);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(2);
        edge.add(4);
        edge.add(5);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(4);
        edge.add(3);
        edge.add(1);
        edges.add(edge);
        edge = new ArrayList<> ();
        edge.add(5);
        edge.add(2);
        edge.add(2);
        edges.add(edge);
        int vertices = 6;
        int[] answer = {0, 3, 2, 4, 6, -1};

       // int[] result = Dijkstra.shortestDistance(edges, vertices);
      //  assertEquals(result, answer);
    }
}
