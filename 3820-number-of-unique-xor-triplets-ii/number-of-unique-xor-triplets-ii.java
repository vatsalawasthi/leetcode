class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] pair = new boolean[2048];
        boolean[] triplet = new boolean[2048];

        for(int a : nums){
            for(int b : nums){
                pair[a^b] = true;
            }
        }
        for(int x = 0; x<2048; x++){
            if (!pair[x]) continue;

            for (int num : nums) {
                triplet[x ^ num] = true;
            }
        }
        int ans = 0;
        for (boolean b : triplet) {
            if (b) ans++;
        }
        return ans;
    }
}