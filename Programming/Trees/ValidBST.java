package Trees;

/**
 * Author - archit.s
 * Date - 04/11/18
 * Time - 4:16 PM
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left=null;
        right=null;
    }
}

public class ValidBST {

    public boolean helper(TreeNode root, int MIN, int MAX){

        if(root == null){
            return true;
        }

        if(root.val > MIN && root.val < MAX){
            return helper(root.left, MIN, root.val) && helper(root.right, root.val, MAX);
        }
        return false;
    }

    public int isValidBST(TreeNode A) {

        return helper(A, Integer.MIN_VALUE, Integer.MAX_VALUE) ? 1:0;
    }
}
