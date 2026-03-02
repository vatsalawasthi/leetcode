class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int totalSwap = 0;

        for(int i = 0; i<n; i++){
            int reqZeros = n-i-1;
            int row = i;

            while (row < n && TrailingZeros(grid[row]) < reqZeros) {
                row++;
            }
            if(row==n){
                return -1;
            }
            while (row > i) {
                swap(grid, row, row - 1);
                totalSwap++;
                row--;
            }
        }
        return totalSwap;
    }
    private void swap(int[][] grid, int i, int j) {
       int[] temp = grid[i];
       grid[i] = grid[j];
       grid[j] = temp;
    }
    private int TrailingZeros(int[] row) {
        int count = 0;
        for (int i = row.length - 1; i >= 0; i--) {
            if (row[i] == 0) count++;
            else break;
        }
        return count;
    }
}