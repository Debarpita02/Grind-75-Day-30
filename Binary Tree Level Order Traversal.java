class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currLevel = new LinkedList<Integer>();

            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll(); // Use poll() instead of remove()
                currLevel.add(currNode.val);
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) { // Check for right child
                    queue.add(currNode.right);
                }
            }
            result.add(currLevel);
        }
        return result;
    }
}