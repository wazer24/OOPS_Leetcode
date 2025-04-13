// Q12.Numbers At Most N Given Digit Set
public class Solution {
    public int atMostNGivenDigitSet(String[] d, int n) {
        String s = String.valueOf(n);
        int len = s.length(), b = d.length, t = 0;

        for (int i = 1; i < len; i++)
            t += Math.pow(b, i);

        for (int i = 0; i < len; i++) {
            boolean f = false;
            char c = s.charAt(i);

            for (String x : d) {
                char y = x.charAt(0);

                if (y < c) {
                    t += Math.pow(b, len - i - 1);
                } else if (y == c) {
                    f = true;
                    break;
                } else {
                    break;
                }
            }

            if (!f) return t;
        }

        return t + 1;
    }

    public static void main(String[] args) {
        Solution o = new Solution();
        System.out.println(o.atMostNGivenDigitSet(new String[]{"1","3","5","7"}, 100));
    }
}
