class Solution {
    public long countCommas(long n) {
        long count = 0;

        long start = 1000;
        long comma = 1;

        while(n>=start){
            long end = start*1000 - 1;

            if(n>=start){
                count += (Math.min(n,end) - start + 1)*comma;
            }
            start *= 1000;
            comma++;
        }
        return count;
    }
}