class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);

        StringBuilder flipped = new StringBuilder();
        for (char c : binary.toCharArray()) {
            flipped.append(c == '0' ? '1' : '0');
        }
        return Integer.parseInt(flipped.toString(), 2);
    }
}