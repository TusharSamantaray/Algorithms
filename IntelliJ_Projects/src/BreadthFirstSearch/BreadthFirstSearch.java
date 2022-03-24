package BreadthFirstSearch;
import java.util.*;

public class BreadthFirstSearch {
    public static int[] breadthFirstSearch(List<List<Integer>> edges,int vertices) {
        if (vertices == 0) return new int [0];
        int[] distance = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            distance[i] = -1;
        }
        distance[0] = 0;
        List<Integer>[] graph = form_graph(edges, vertices);
        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            visited[i] = false;
        }
        visited[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (queue.size() > 0) {
            int u = queue.poll();
            for (int v: graph[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                    distance[v] = distance[u] + 1;
                }
            }
        }
        return distance;
    }

    static List<Integer>[] form_graph(List<List<Integer>> edges, int vertices) {
        List<Integer>[] g = new List[vertices];
        for (int i = 0; i < vertices; i++)
            g[i] = new ArrayList<>();
        for (List<Integer> u : edges) {
            g[u.get(0)].add(u.get(1));
        }
        return g;
    }
}
