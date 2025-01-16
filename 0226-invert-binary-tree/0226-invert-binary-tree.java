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
    public TreeNode invertTree(TreeNode root) {

        if(root==null)
           return root;

        Queue<TreeNode> duoQ = new LinkedList<>();
        duoQ.offer(root);

        while(!duoQ.isEmpty()){
            TreeNode currentNode = duoQ.poll();
            TreeNode oldLeft = currentNode.left;

            currentNode.left = currentNode.right;
            currentNode.right = oldLeft;

            if(currentNode.left!=null)
                duoQ.offer(currentNode.left);
            
            if(currentNode.right!=null)    
                duoQ.offer(currentNode.right);
        }

        return root;
    }
}