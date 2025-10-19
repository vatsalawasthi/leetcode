class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(top<=bottom && left<=right){
            for(int i = left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            if(top<=bottom){
                for(int j = top; j<=bottom; j++){
                    result.add(matrix[j][right]);
                }
                right--;
            }
            if (top <= bottom && left <= right) {
                for (int c = right; c >= left; c--) {
                    result.add(matrix[bottom][c]);
                }
                bottom--;
            }
            if (top <= bottom && left <= right) {
                for (int r = bottom; r >= top; r--) {
                    result.add(matrix[r][left]);
                }
                left++;
            }
        }

        return result;
    }
}