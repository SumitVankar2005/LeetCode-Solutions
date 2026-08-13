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

    public static void InorderTraversal(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        InorderTraversal(root.left,list);
        list.add(root.val);
        InorderTraversal(root.right,list);
    }

    public static boolean isSorted(ArrayList<Integer> list){
        for(int i = 0; i<list.size() - 1; i++){
            if(!(list.get(i) < list.get(i+1))){
                return false;
            }
        }
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        InorderTraversal(root,list);
        if(isSorted(list)){
            return true;
        }
        return false;
    }
}