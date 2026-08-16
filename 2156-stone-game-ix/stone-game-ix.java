class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];

        for(int stone : stones){
            count[stone%3]++;
        }
        if (count[0] % 2 == 0) {
           if(count[1] > 0 && count[2] > 0){
            return true;
           }
           return false;
        }
        if(Math.abs(count[1] - count[2]) > 2){
            return true;
        }
        return false;
    }
}