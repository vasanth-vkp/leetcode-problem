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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ls=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root == null){
            return ls;
        }
        q.add(root);
        boolean ltr=true;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>lis=new ArrayList<>();
            for(int i=0;i<n;i++){
            TreeNode cur=q.poll();
             if(ltr){
                lis.add(cur.val);
            }
            else{
                lis.add(0,cur.val);
            }
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
            }
            ls.add(lis);
            ltr=!ltr;
        }
        return ls;

    }
}