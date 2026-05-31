class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long currentMass = mass;
        for(int n : asteroids){
            if(currentMass < n){
                return false;
            }
            currentMass += n;
        }
        return true;
    }
}