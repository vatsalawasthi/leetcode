/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        solve(root, targetSum, path);
        return ans;
    }

    public void solve(TreeNode root, int targetSum, List<Integer> path) {

        if (root == null) {
            return;
        }
        path.add(root.val);

        if (root.left == null && root.right == null) {

            if (targetSum == root.val) {
                ans.add(new ArrayList<>(path));
            }

        } else {
            solve(root.left, targetSum - root.val, path);
            solve(root.right, targetSum - root.val, path);
        }
        path.remove(path.size() - 1);
    }
}