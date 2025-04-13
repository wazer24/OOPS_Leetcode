// Q19. Increasing Triplet Subsequence
public class Solution {
    public boolean increasingTriplet(int[] n) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int x : n) {
            if (x <= a) {
                a = x;
            } else if (x <= b) {
                b = x;
            } else {
                return true;
            }
        }
        return false;
    }
}