// Q13. Sum of Subarray Minimums

import java.util.*;

public class Solution {

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1_000_000_007;
        long res = 0;

        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            res = (res + (long) arr[i] * (i - left[i]) * (right[i] - i)) % MOD;
        }

        return (int) res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3, 1, 2, 4};
        System.out.println("Sum of subarray minimums: " + s.sumSubarrayMins(arr));
    }
}
