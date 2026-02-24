class Solution {
    public int maximumSwap(int num) {
        String str = String.valueOf(num);
        char[] digits = str.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            char largest = digits[i];
            int index = -1;
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[j] >= largest) {
                    largest = digits[j];
                    index = j;
                }
            }

            if (index != -1 && digits[i] < largest) {
                char temp = digits[i];
                digits[i] = digits[index];
                digits[index] = temp;

                return Integer.parseInt(new String(digits));
            }
        }

        return num;
    }
}