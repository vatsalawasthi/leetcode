class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] c1 = parse(num1);
        int[] c2 = parse(num2);

        int a = c1[0]; int b = c1[1];
        int c = c2[0]; int d = c2[1];

        int real = a * c - b * d;
        int imaginary = a * d + b * c;

        return real +  "+" + imaginary + "i";
    }
    private int[] parse(String s) {
        String[] parts = s.split("\\+");
        int real = Integer.parseInt(parts[0]);
        int imaginary = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));

        return new int[]{real, imaginary};
    }
}