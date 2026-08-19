class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];

        return jumps(arr, start, visited);
    }
    public boolean jumps(int[] arr, int i, boolean[] visited){
        if(i<0 || i>=arr.length || visited[i]){
            return false;
        }
        if(arr[i] == 0){
            return true;
        }
        visited[i] = true;

        return jumps(arr, arr[i] + i, visited) || jumps(arr, i-arr[i], visited);
    }
}