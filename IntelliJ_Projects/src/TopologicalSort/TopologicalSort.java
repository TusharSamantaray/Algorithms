package TopologicalSort;
import java.util.*;

public class TopologicalSort {
    public static List<Integer> topoSort(List<List<Integer>> pre_requisites, int total_courses) {
            Stack<Integer> stack = new Stack<Integer>();
            List<Integer> result = new ArrayList<Integer>();
            HashMap<Integer, List<Integer>> pre_req_dict = new HashMap<>();
            pre_req_dict = neighbours(pre_requisites);

            boolean visited[] = new boolean[total_courses];
            for (int i = 0; i < total_courses; i++) visited[i] = false;
            for (int i = 0; i < total_courses; i++) if (visited[i] == false) sort(i, visited, pre_req_dict, stack);
            while (stack.empty() == false) result.add(stack.pop());
            Collections.reverse(result);
            return result;
    }

    public static void sort(int v, boolean visited[], HashMap<Integer, List<Integer>> pre_req_dict, Stack<Integer> stack) {
        visited[v] = true;
        Integer i;
        if (pre_req_dict.containsKey(v)) {
            List<Integer> adj = pre_req_dict.get(v);
            Iterator<Integer> it = adj.iterator();
            while(it.hasNext()) {
                i = it.next();
                if (!visited[i]) sort(i, visited, pre_req_dict, stack);
            }
        }
        stack.push(v);
    }

    public static HashMap<Integer, List<Integer>> neighbours(List<List<Integer>> pre_requisites) {
        HashMap<Integer, List<Integer>> pre_req_dict = new HashMap<>();
        for (int i = 0; i < pre_requisites.size(); i++) {
            List<Integer> courses = pre_requisites.get(i);
            if (!pre_req_dict.containsKey(courses.get(1))) {
                pre_req_dict.put(courses.get(1), Collections.singletonList(courses.get(0)));
            } else {
                List<Integer> l = pre_req_dict.get(courses.get(1));
                l.add(courses.get(0));
                pre_req_dict.put(courses.get(1), l);
            }
        }
        return pre_req_dict;
    }
}
