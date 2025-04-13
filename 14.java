// Q.14 Merge String Alternately


class Solution {
    public String mergeAlternately(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i = 0, j = 0;
        while (i < a.length() || j < b.length()) {
            if (i < a.length()) {
                s.append(a.charAt(i++));
            }
            if (j < b.length()) {
                s.append(b.charAt(j++));
            }
        }
        return s.toString();
    }
}