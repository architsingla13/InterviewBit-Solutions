package Trees;

/**
 * Author - archit.s
 * Date - 05/11/18
 * Time - 11:28 AM
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode l, TreeNode r){

        if(l == null && r == null){
            return true;
        }
        if(l == null || r == null){
            return false;
        }

        if(l.val == r.val && isSymmetric(l.left,r.right) && isSymmetric(l.right,r.left)){
            return true;
        }
        return false;
    }

    public int isSymmetric(TreeNode A) {

        if(A == null){
            return 1;
        }

        return isSymmetric(A.left, A.right) ? 1:0;
    }
}
