class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int sum = 0;

        int max = salary[0];
        int min = salary[0];

        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }

        sum = sum - min - max;
     return (double) sum/(n-2);
}
}