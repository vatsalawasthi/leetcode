class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA += aliceSizes[i];
        }
        for (int j = 0; j < bobSizes.length; j++) {
            sumB += bobSizes[j];
        }

        int diff = (sumB - sumA) / 2;  // Bob's number must be Alice's + diff

        // brute-force check with loops
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (bobSizes[j] == aliceSizes[i] + diff) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }

        return new int[0]; // shouldn't reach here
    }
}
