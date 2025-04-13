// Q.16 Kids With the Greatest Number of Candies
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        List<Boolean> r = new ArrayList<>();
        int m = 0;
        for (int x : c) {
            if (x > m) {
                m = x;
            }
        }
        for (int x : c) {
            r.add(x + e >= m);
        }
        return r;
    }
}