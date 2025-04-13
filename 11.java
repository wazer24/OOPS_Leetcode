// Q 11. Bitwise ORs of Subarrays
import java.util.*;

public class Solution {
    public int subarrayBitwiseORs(int[] a) {
        Set<Integer> r = new HashSet<>();  
        Set<Integer> p = new HashSet<>();  

        for (int n : a) {
            Set<Integer> c = new HashSet<>();  
            c.add(n);

            for (int x : p) c.add(x | n);

            r.addAll(c);
            p = c;
        }

        return r.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1, 2, 4};
        System.out.println("Unique ORs: " + s.subarrayBitwiseORs(a));
    }
}
