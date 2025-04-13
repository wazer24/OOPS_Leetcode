// Q15.Greatest Common Divisor of Strings

class Solution {
    public String gcdOfStrings(String w1, String w2) {
        if (!(w1 + w2).equals(w2 + w1)) {
            return "";
        }
        int a = w1.length();
        int b = w2.length();
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return w1.substring(0, a);
    }
}