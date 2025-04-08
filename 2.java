// Q2.Delete and delete
import java.util.*;

class Solution {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 0) return 0;
        
        Map<Integer, Integer> points = new TreeMap<>();
        for (int num : nums) points.put(num, points.getOrDefault(num, 0) + num);
        
        int prev = 0, curr = 0;
        int last = -2; 
        
        for (int key : points.keySet()) {
            int temp = curr;
            curr = (key == last + 1) ? Math.max(curr, prev + points.get(key)) : curr + points.get(key);
            prev = temp;
            last = key;
        }
        return curr;
    }
}
