https://leetcode.com/problems/n-queens/description/?envType=problem-list-v2&envId=m3r184od

public List<List<String>> solveNQueens(int n) {
    List<List<String>> res = new ArrayList<>();
    char[][] board = new char[n][n];
    for (char[] row : board) Arrays.fill(row, '.');
    backtrack(0, board, res, n);
    return res;
}

private void backtrack(int row, char[][] board, List<List<String>> res, int n) {
    if (row == n) {
        List<String> solution = new ArrayList<>();
        for (char[] r : board) {
            solution.add(new String(r));
        }
        res.add(solution);
        return;
    }

    for (int col = 0; col < n; col++) {
        if (isValid(board, row, col, n)) {
            board[row][col] = 'Q';
            backtrack(row + 1, board, res, n);
            board[row][col] = '.';
        }
    }
}

private boolean isValid(char[][] board, int row, int col, int n) {
    for (int i = 0; i < row; i++) {
        if (board[i][col] == 'Q') return false;
    }

    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') return false;
    }

    for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
        if (board[i][j] == 'Q') return false;
    }

    return true;
}
