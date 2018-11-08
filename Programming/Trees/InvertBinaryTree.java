package Trees;

/**
 * Author - archit.s
 * Date - 08/11/18
 * Time - 12:32 PM
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode A) {

        if(A == null){
            return null;
        }
        else if(A.left == null && A.right == null){
            return A;
        }

        invertTree(A.left);
        invertTree(A.right);

        TreeNode temp = A.right;
        A.right = A.left;
        A.left = temp;

        return A;
    }
}
