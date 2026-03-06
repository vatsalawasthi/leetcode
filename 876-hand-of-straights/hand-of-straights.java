class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }
        Arrays.sort(hand);
        int count = 0;
        boolean[] used = new boolean[hand.length];

        for(int i = 0; i<hand.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            int prev = hand[i];
            count = 1;

            for(int j = i+1; j<hand.length && count < groupSize; j++){
                if(!used[j] && hand[j] == prev + 1){
                    used[j] = true;
                    prev = hand[j];
                    count++;
                }
            }
            if(count!=groupSize){
                return false;
            }
        }
        return true;
    }
}