class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (a, b) -> {
            int bitCompare = Integer.bitCount(a) - Integer.bitCount(b);
            if (bitCompare != 0) return bitCompare;
            return a - b;
        });
        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }
}