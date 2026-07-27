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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        fun(root,ls);
        return ls;
    }
    public void  fun(TreeNode cur,List<Integer> ls){
        if(cur==null){
           return;
        }
        ls.add(cur.val);
        
        fun(cur.left,ls);
        fun(cur.right,ls);
    }
}