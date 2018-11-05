package Trees;

/**
 * Author - archit.s
 * Date - 04/11/18
 * Time - 5:18 PM
 */
public class MaxDepth {

    public int maxDepth(TreeNode A) {

        if(A == null){
            return 0;
        }

        if(A.left == null && A.right == null){
            return 1;
        }

        return Math.max(maxDepth(A.left), maxDepth(A.right)) + 1;
    }
}
