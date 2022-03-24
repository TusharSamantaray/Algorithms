package FamilyForest;
import java.util.*;

public class FamilyForest {
    HashMap<String, String> families = new HashMap<>();
    HashMap<String, Integer> rank = new HashMap<>();

    public void make_family(String s) {
        families.put(s, s);
        rank.put(s, 0);
    }

    public String union(String s, String t) {
        if (rank.get(families.get(s)) > rank.get(families.get(t))) {
            families.put(t, s);
            return s;
        } else if (rank.get(families.get(t)) > rank.get(families.get(s))) {
            families.put(s, t);
            return t;
        } else {
            families.put(t, s);
            rank.put(s, rank.get(s) + 1);
            return s;
        }
    }

    public String find(String s) {
        if (families.get(s) == s) {
            return s;
        } else {
            String res = find(families.get(s));
            families.put(s, res);
            return res;
        }
    }
}
