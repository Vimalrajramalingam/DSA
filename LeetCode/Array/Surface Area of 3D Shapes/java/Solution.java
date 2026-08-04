class Solution {
    public int surfaceArea(int[][] grid) {
        int area = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid.length; c++) {
                if (grid[r][c] == 0) {
                    continue;
                }

                area += 2;
                
                if (r > 0) {
                    area += Math.max(grid[r][c] - grid[r - 1][c], 0);
                } else {
                    area += grid[r][c];
                }

                if (r < grid.length - 1) {
                    area += Math.max(grid[r][c] - grid[r + 1][c], 0);
                } else {
                    area += grid[r][c];
                }

                if (c > 0) {
                    area += Math.max(grid[r][c] - grid[r][c - 1], 0);
                } else {
                    area += grid[r][c];
                }

                if (c < grid.length - 1) {
                    area += Math.max(grid[r][c] - grid[r][c + 1], 0);
                } else {
                    area += grid[r][c];
                }
            }
        }

        return area;
    }
}