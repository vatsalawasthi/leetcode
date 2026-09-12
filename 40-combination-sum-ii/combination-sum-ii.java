class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(0, candidates, target, new ArrayList<>());
        return ans;
    }

    void solve(int start, int[] candidates, int target, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < candidates.length; i++){
            if(candidates[i] > target){
                break;
            }
            if(i > start && candidates[i] == candidates[i - 1]){
                continue;
            }
            list.add(candidates[i]);
        solve(i + 1, candidates, target - candidates[i], list);
        list.remove(list.size() - 1);
        }
    }
}