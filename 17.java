// Q17.  Can Place Flowers
class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int c = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] == 0) {
                boolean p = (i == 0) || (f[i - 1] == 0);
                boolean nx = (i == f.length - 1) || (f[i + 1] == 0);
                if (p && nx) {
                    f[i] = 1;
                    c++;
                    if (c >= n) {
                        return true;
                    }
                }
            }
        }
        return c >= n;
    }
}