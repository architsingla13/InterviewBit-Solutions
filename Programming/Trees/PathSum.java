package Trees;

/**
 * Author - archit.s
 * Date - 08/11/18
 * Time - 1:39 PM
 */
public class PathSum {

    public int hasPathSum(TreeNode A, int B) {

        if(A == null){
            return 0;
        }

        if(A.val == B && A.left == null && A.right == null){
            return 1;
        }

        if(hasPathSum(A.left, B-A.val) == 1 || hasPathSum(A.right, B-A.val) == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
}
