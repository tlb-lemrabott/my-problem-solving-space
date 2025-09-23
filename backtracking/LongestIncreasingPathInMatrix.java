// https://leetcode.com/problems/longest-increasing-path-in-a-matrix/description/

public class LongestIncreasingPathInMatrix {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        int max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                max = Math.max(max, dfs(matrix, dp, i, j));
            }
        }
        return max;
    }

        private int dfs(int[][] matrix, int[][] dp, int i, int j) {
            if (dp[i][j] != 0) return dp[i][j];
            int max = 1;
            if (i > 0 && matrix[i][j] < matrix[i - 1][j]) {
                max = Math.max(max, 1 + dfs(matrix, dp, i - 1, j));
            }
            if (i < matrix.length - 1 && matrix[i][j] < matrix[i + 1][j]) {
                max = Math.max(max, 1 + dfs(matrix, dp, i + 1, j));
            }
            if (j > 0 && matrix[i][j] < matrix[i][j - 1]) {
                max = Math.max(max, 1 + dfs(matrix, dp, i, j - 1));
            }
            if (j < matrix[0].length - 1 && matrix[i][j] < matrix[i][j + 1]) {
                max = Math.max(max, 1 + dfs(matrix, dp, i, j + 1));
            }
            dp[i][j] = max;
            return max;
        }
}
