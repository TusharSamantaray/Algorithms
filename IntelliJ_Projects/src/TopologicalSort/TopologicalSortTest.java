package TopologicalSort;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class TopologicalSortTest {
    @Test
    public void Test1() {
        int total_courses = 5;
        List<List<Integer>> pre_requisites = new ArrayList<>();

        List<Integer> course1 = new ArrayList<>();
        course1.add(0);
        course1.add(1);
        pre_requisites.add(course1);

        List<Integer> course2 = new ArrayList<>();
        course2.add(0);
        course2.add(2);
        pre_requisites.add(course2);

        List<Integer> course3 = new ArrayList<>();
        course3.add(1);
        course3.add(2);
        pre_requisites.add(course3);

        List<Integer> course4 = new ArrayList<>();
        course4.add(1);
        course4.add(3);
        pre_requisites.add(course4);

        List<Integer> course5 = new ArrayList<>();
        course5.add(2);
        course5.add(4);
        pre_requisites.add(course5);

        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(1);
        ans.add(3);
        ans.add(2);
        ans.add(4);

        List<Integer> result = TopologicalSort.topoSort(pre_requisites, 5);
        for (int val: result) {
            System.out.print(val);
        }
        assertEquals(ans, result);
    }

    @Test
    public void Test2() {
        int total_courses = 5;
        List<List<Integer>> pre_requisites = new ArrayList<>();

        List<Integer> course1 = new ArrayList<>();
        course1.add(0);
        course1.add(1);
        pre_requisites.add(course1);

        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(1);

        List<Integer> result = TopologicalSort.topoSort(pre_requisites, 2);
        for (int val: result) {
            System.out.print(val);
        }
        assertEquals(ans, result);
    }

    @Test
    public void Test3() {
        int total_courses = 5;
        List<List<Integer>> pre_requisites = new ArrayList<>();

        List<Integer> course1 = new ArrayList<>();

        List<Integer> ans = new ArrayList<>();

        List<Integer> result = TopologicalSort.topoSort(pre_requisites, 0);
        for (int val: result) {
            System.out.print(val);
        }
        assertEquals(ans, result);
    }
}
