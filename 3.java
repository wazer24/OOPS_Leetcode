// Q3.Unique paths

import java.util.Arrays; 
class Solution { 
    public int uniquePaths(int m, int n) { 
        int[] op = new int[n]; 
        Arrays.fill(op, 1); 
        for (int i = 1; i < m; i++) { 
            for (int j = 1; j < n; j++) { 
                op[j] += op[j - 1]; 
            } 
        } 
        return op[n - 1]; 
    } 
}