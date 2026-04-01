class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;

        Integer[] idx = new Integer[n];
        for(int i = 0; i < n; i++) idx[i] = i;

        Arrays.sort(idx, (a, b) -> Integer.compare(positions[a], positions[b]));

        Deque<Integer> robots = new ArrayDeque<>();
        boolean[] alive = new boolean[n];
        Arrays.fill(alive, true);

        for(int id : idx){
            if(directions.charAt(id) == 'R'){
                robots.push(id);
            } else {
                while(!robots.isEmpty() 
                      && directions.charAt(robots.peek()) == 'R' 
                      && healths[id] > 0){

                    int top = robots.peek();

                    if(healths[top] < healths[id]){
                        robots.pop();
                        alive[top] = false;
                        healths[id]--;
                    }
                    else if(healths[top] > healths[id]){
                        healths[top]--;
                        alive[id] = false;
                        healths[id] = 0;
                    }
                    else {
                        robots.pop();
                        alive[top] = false;
                        alive[id] = false;
                        healths[id] = 0;
                    }
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(alive[i]){
                ans.add(healths[i]);
            }
        }

        return ans;
    }
}