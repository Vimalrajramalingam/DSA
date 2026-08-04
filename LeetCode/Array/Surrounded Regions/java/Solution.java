class Solution {
    int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    char[][] board;
    int n, m;
    int[][] visit;
    private void dfs(int row, int col) {
        visit[row][col] = 1;  
        for (int[] d : dir) {
            int x = row + d[0];
            int y = col + d[1];
            if (x >= 0 && x < n && y >= 0 && y < m && visit[x][y] == 0 && board[x][y] == 'O') {
                dfs(x, y);
            }
        }
    }

    public void solve(char[][] board) {
        n = board.length;
        m = board[0].length;
        this.board = board;
        visit = new int[n][m];
        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O' && visit[0][i] == 0) dfs(0, i);
            if (board[n - 1][i] == 'O' && visit[n - 1][i] == 0) dfs(n - 1, i);
        }
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && visit[i][0] == 0) dfs(i, 0);
            if (board[i][m - 1] == 'O' && visit[i][m - 1] == 0) dfs(i, m - 1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && visit[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}