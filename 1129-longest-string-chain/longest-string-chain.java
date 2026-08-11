class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int ans = 1;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                if(words[i].length() == words[j].length() + 1){
                    if (isPredecessor(words[j], words[i])) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
    private boolean isPredecessor(String shorter, String longer){
        int i = 0;
        int j = 0;

        boolean skip = false;

        while(i<shorter.length() && j<longer.length()){
            if(shorter.charAt(i) == longer.charAt(j)){
                i++;
                j++;
            }else{
                if(skip){
                    return false;
                }
                skip = true;
                j++;
            }
        }
        return true;
    }
}