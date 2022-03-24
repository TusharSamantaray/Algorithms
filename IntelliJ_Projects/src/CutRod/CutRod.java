package CutRod;
import java.util.*;

public class CutRod {
    Hashtable<Integer, CutResult> a = new Hashtable<>();

    static class CutResult {
        CutResult(int c, int amt, CutResult r) {
            cut = c;
            cost = amt;
            result = r;
        }

        int cut;
        int cost;
        CutResult result;
    }

    public static CutResult cut_rod(int[] P, int n) {
        if (n == 0) { // base case
            return new CutResult(0, 0, null);
        } else { // recursive
            CutResult best_yet = null;
            for (int i = 1; i != n+1; ++i) {
                CutResult rest = cut_rod(P, n - i);
                int cost = P[i] + rest.cost;
                if (best_yet == null || best_yet.cost < cost) {
                    best_yet = new CutResult(i, cost, rest);
                }
            }
            return best_yet;
        }
    }

}
