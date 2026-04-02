class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;

        int[][][] dp = new int[m][n][3];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                for(int z = 0; z < 3; z++){
                    dp[i][j][z] = Integer.MIN_VALUE;
                }
            }
        }
        for(int z = 0; z < 3; z++){
            if(coins[0][0] >= 0){
                dp[0][0][z] = coins[0][0];
            } else {
                dp[0][0][z] = coins[0][0]; 
                if (z > 0) {
                    dp[0][0][z] = Math.max(dp[0][0][z], 0); 
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(i == 0 && j == 0) continue; 

                for(int z = 0; z < 3; z++){

                    int best = Integer.MIN_VALUE;

                    if(i > 0) best = Math.max(best, dp[i-1][j][z]);
                    if(j > 0) best = Math.max(best, dp[i][j-1][z]);

                    if(best == Integer.MIN_VALUE) continue;

                    if(coins[i][j] >= 0){
                        dp[i][j][z] = best + coins[i][j];
                    } else {
                        dp[i][j][z] = best + coins[i][j];

                        if(z > 0){
                            int prev = Integer.MIN_VALUE;

                            if(i > 0) prev = Math.max(prev, dp[i-1][j][z-1]);
                            if(j > 0) prev = Math.max(prev, dp[i][j-1][z-1]);

                            if(prev != Integer.MIN_VALUE){
                                dp[i][j][z] = Math.max(dp[i][j][z], prev);
                            }
                        }
                    }
                }
            }
        }
        return Math.max(dp[m-1][n-1][0],
               Math.max(dp[m-1][n-1][1], dp[m-1][n-1][2]));
    }
}