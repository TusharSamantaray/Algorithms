//package Dijkstra;
//import java.util.*;
//
//public class Dijkstra {
//    public static int[] shortestDistance(List<List<Integer>> edges,int vertices) {
//        if (vertices == 0) return new int [0];
//        int[] distance = new int[vertices];
//        for (int i = 0; i < vertices; i++) {
//            distance[i] = -1;
//        }
//        distance[0] = 0;
//        List<Integer>[] graph = form_graph(edges, vertices);
//
//        Queue<List> queue = new LinkedList<>();
//
//        List<Integer> start_position = new ArrayList<>();
//        start_position.add(0);
//        start_position.add(0);
//        queue.add(start_position);
//
//        while (queue.size() > 0) {
//            List<Integer> temp = new LinkedList<>();
//            temp = queue.poll();
//            int current_distance = temp.get(0);
//            int current_vertex = temp.get(1);
//
//            if (current_distance > distance[current_vertex]) {
//                continue;
//            }
//
////            for (List<Integer>[] temp1:
////                 graph[current_vertex]) {
////                    continue;
////            }
//
//
//    }
//
//    static List<Integer>[] form_graph(List<List<Integer>> edges, int vertices) {
//        List<Integer>[] g = new List[vertices];
//        for (int i = 0; i < vertices; i++)
//            g[i] = new ArrayList<>();
//        for (List<Integer> u : edges) {
//            g[u.get(0)].add(u.get(1));
//        }
//        return g;
//    }
//}
