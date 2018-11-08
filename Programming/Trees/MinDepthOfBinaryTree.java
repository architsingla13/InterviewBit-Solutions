package Trees;

/**
 * Author - archit.s
 * Date - 08/11/18
 * Time - 1:32 PM
 */
public class MinDepthOfBinaryTree {

    public int minDepth(TreeNode A) {

        if(A == null){
            return 0;
        }
        else if(A.left == null && A.right == null){
            return 1;
        }
        else if(A.left == null && A.right != null){
            return 1+minDepth(A.right);
        }
        else if(A.left != null && A.right == null){
            return 1+minDepth(A.left);
        }

        return Math.min(minDepth(A.left),minDepth(A.right)) + 1;
    }
}
