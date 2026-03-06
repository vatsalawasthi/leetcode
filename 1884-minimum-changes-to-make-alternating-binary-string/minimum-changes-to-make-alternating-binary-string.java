class Solution {
    public int minOperations(String s) {
        int changes1 = 0;
        int changes2 = 0;

        for(int i = 0; i < s.length(); i++){
            char expected1 = (i % 2 == 0) ? '0' : '1'; // pattern 0101...
            char expected2 = (i % 2 == 0) ? '1' : '0'; // pattern 1010...

            if(s.charAt(i) != expected1){
                changes1++;
            }
            if(s.charAt(i) != expected2){
                changes2++;
            }
        }
        return Math.min(changes1, changes2);
    }
}