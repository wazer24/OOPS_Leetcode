// Q1.Unique paths 2
class Solution {
    int[][] dp;

    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];

        for (int i = 0; i < m; i++)
            Arrays.fill(dp[i], -1);

        return dfs(grid, 0, 0);
    }

    int dfs(int[][] grid, int row, int col) {
        int m = grid.length, n = grid[0].length;

        if (row >= m || col >= n || grid[row][col] == 1)
            return 0;

        if (row == m - 1 && col == n - 1)

            return 1;

        if (dp[row][col] != -1)
            return dp[row][col];

        dp[row][col] = dfs(grid, row, col + 1) + dfs(grid, row + 1, col);

        return dp[row][col];
    }
}
