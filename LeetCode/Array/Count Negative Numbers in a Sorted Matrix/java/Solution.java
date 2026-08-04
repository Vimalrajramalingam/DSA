class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int row=grid.length;
        int col=grid[0].length;
        int r=row-1;
        int c=0;
        while(r>=0&&c<col)
        {
            if(grid[r][c]<0)
            {
                count=count+(col-c);
                r--;
            }
            else
            {
                c++;
            }
        }
        return count;
    }
}