// Q6. min Cost Climbing Stairs
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int a = cost[0];
        int b = cost[1];
        int c = 0, d = 0;
        
        for (int i = 2; i < n; i++) {
            d = Math.min(a, b);
            
            c = cost[i] + d;
            
            a = b;  
            b = c;  
        }
        
        return Math.min(a, b);
    }
}
