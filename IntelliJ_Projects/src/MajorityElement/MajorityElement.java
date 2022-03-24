package MajorityElement;
import java.util.*;

public class MajorityElement {
    public static int majority(int[] A) {
        Hashtable<Integer, Integer> Element_count = new Hashtable<>();
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (Element_count.containsKey(A[i]))
                Element_count.put(A[i], Element_count.get(A[i]) + 1);
            else
                Element_count.put(A[i], 1);
        }

        for (int i = 0; i < Element_count.size(); i++)
            if (Element_count.get(A[i]) > n/2) return A[i];
        return -1;
    }
}
