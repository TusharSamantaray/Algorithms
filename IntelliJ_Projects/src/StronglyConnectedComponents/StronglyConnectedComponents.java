package StronglyConnectedComponents;
import java.util.*;

public class StronglyConnectedComponents {
    public static List<List<Integer>> scc(int students, List<List<Integer>> knows) {
        List<Integer>[] graph = form_graph(knows, students);

        boolean[] used = new boolean[students];
        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < students; i++) {
            if (!used[i])
                dfs(graph, used, order, i);
        }

        List<Integer>[] reverseGraph = new List[students];
        for (int i = 0; i < students; i++)
            reverseGraph[i] = new ArrayList<>();
        for (int i = 0; i < students; i++)
            for (int j : graph[i])
                reverseGraph[j].add(i);
        List<List<Integer>> components = new ArrayList<>();
        Arrays.fill(used, false);
        Collections.reverse(order);

        for (int u : order)
            if (!used[u]) {
                List<Integer> component = new ArrayList<>();
                dfs(reverseGraph, used, component, u);
                components.add(component);
            }

        return components;
    }

    static void dfs(List<Integer>[] graph, boolean[] used, List<Integer> res, int u) {
        used[u] = true;
        for (int v : graph[u])
            if (!used[v])
                dfs(graph, used, res, v);
        res.add(u);
    }

    static List<Integer>[] form_graph(List<List<Integer>> knows, int students) {
        List<Integer>[] g = new List[students];
        for (int i = 0; i < students; i++)
            g[i] = new ArrayList<>();
        for (List<Integer> u : knows) {
            g[u.get(0)].add(u.get(1));
        }

        return g;
    }
}
