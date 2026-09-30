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
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        // Queue for level order traversal (BFS)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        TreeNode current = null;
        
        while (!queue.isEmpty()) {
            current = queue.poll();
            
            // Push the RIGHT child first so that the LEFT child 
            // is processed later and ends up at the bottom of the queue.
            if (current.right != null) {
                queue.add(current.right);
            }
            if (current.left != null) {
                queue.add(current.left);
            }
        }
        
        // The last node remaining after the right-to-left BFS is the bottom-left value
        return current.val;
    }
}
