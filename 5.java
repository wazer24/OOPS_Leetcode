// Q5.House Robber
class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int prev = 0, curr = 0;
        
        for (int num : nums) {
            int temp = Math.max(curr, prev + num);
            prev = curr;
            curr = temp;
        }
        
        return curr;  
    }
}
