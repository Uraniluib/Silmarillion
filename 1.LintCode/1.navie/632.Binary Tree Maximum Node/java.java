/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if(root == null)
            return null;
        int max = root.val;
        TreeNode maxNode = root;
        Stack<TreeNode> nodeS = new Stack<TreeNode>();
        while(root != null || nodeS.empty() != true)
        {
            while(root != null)
            {
                nodeS.push(root);
                TreeNode nodeLeft = root.left;
                if(root.val > max)
                {
                    max = root.val;
                    maxNode = root;
                }
                root = nodeLeft;
            }
            
            if(nodeS.empty() != true)
            {
                root = nodeS.pop();
                root = root.right;
            }
        }
        return maxNode;
    }
}