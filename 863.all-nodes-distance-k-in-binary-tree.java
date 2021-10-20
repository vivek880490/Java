/*
 * @lc app=leetcode id=863 lang=java
 *
 * [863] All Nodes Distance K in Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        if (root == null)
            return al;
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        parent(map, root);
        HashSet<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.remove();
                visited.add(cur);
                if (k == 0) {
                    al.add(cur.val);
                }

                if (map.containsKey(cur) && !visited.contains(map.get(cur))) {
                    q.add(map.get(cur));
                }
                if (cur.left != null && !visited.contains(cur.left)) {
                    q.add(cur.left);
                }

                if (cur.right != null && !visited.contains(cur.right)) {
                    q.add(cur.right);
                }
            }
            k--;
            if (k < 0)
                break;
        }
        return al;

    }

    void parent(HashMap<TreeNode, TreeNode> map, TreeNode root) {

        if (root == null)
            return;
        if (root.left != null) {
            map.put(root.left, root);
        }

        if (root.right != null) {
            map.put(root.right, root);
        }

        parent(map, root.left);
        parent(map, root.right);
        return;
    }

}
// @lc code=end
