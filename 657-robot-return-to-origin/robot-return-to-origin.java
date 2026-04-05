class Solution {
    public boolean judgeCircle(String moves) {
        int i = 0;
        int j = 0;
        int move = 0;

        while (move < moves.length()) {
            if (moves.charAt(move) == 'U') {
                i++;
            } else if (moves.charAt(move) == 'D') {
                i--;
            } else if (moves.charAt(move) == 'R') {
                j++;
            } else {
                j--;
            }
            move++;  
        }
        return i == 0 && j == 0;
    }
}