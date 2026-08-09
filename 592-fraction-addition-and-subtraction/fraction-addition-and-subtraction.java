class Solution {
    public String fractionAddition(String expression) {
        int num = 0;
        int den = 1;

        int i = 0;

        while (i < expression.length()){
            int sign = 1;

            // Checking sign
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                if (expression.charAt(i) == '-'){
                    sign = -1;
                }
                i++;
            }

            // Reading numerator
            int currNum = 0;
            while (i < expression.length() && 
                   Character.isDigit(expression.charAt(i))){
                currNum = currNum * 10 + (expression.charAt(i) - '0');
                i++;
            }

            currNum *= sign;

            // Skip 
            i++;

            // Reading denominator
            int currDen = 0;
            while (i < expression.length() && 
                   Character.isDigit(expression.charAt(i))) {
                currDen = currDen * 10 + (expression.charAt(i) - '0');
                i++;
            }

            // Adding fractions
            num = num * currDen + currNum * den;
            den = den * currDen;

            // Reducing
            int gcd = gcd(Math.abs(num), den);
            num /= gcd;
            den /= gcd;
        }

        return num + "/" + den;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}