class Solution {
    public int maximumWidth(int[] planks) {
        int n = planks.length;

        Map<Integer,Integer> heights = new HashMap<>();
        Map<Integer,Integer> res = new HashMap<>();


        for (int x : planks){  // freq add krre h planks ki
            heights.put(x,heights.getOrDefault(x,0)+1);
            res.put(x,res.getOrDefault(x,0)+1);
        }

        for (int i : heights.keySet()) {
            for (int j : heights.keySet()) {
                if(i<j){
                    res.put(i+j,res.getOrDefault(i+j,0)+Math.min(heights.get(i),heights.get(j)));
                }
                if(i==j){
                    res.put(i+j,res.getOrDefault(i+j,0)+heights.get(i)/2);
                }
            }
        }

        int ans = 0;

        for(int v : res.values()){
            ans = Math.max(ans,v);
        }
        return ans;
    }
}