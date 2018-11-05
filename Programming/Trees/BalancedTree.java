package Trees;

/**
 * Author - archit.s
 * Date - 05/11/18
 * Time - 11:19 AM
 */
public class BalancedTree {

    class Height{
        int d;
        public Height(int h){
            this.d = h;
        }
    }

    public boolean isBalanced(TreeNode A, Height h){

        if(A == null){
            h.d = 0;
            return true;
        }

        Height l = new Height(0);
        Height r = new Height(0);
        if(!isBalanced(A.left, l) || !isBalanced(A.right, r)){
            return false;
        }

        h.d = Math.max(l.d,r.d) + 1;
        if(Math.abs(l.d - r.d) <=1){
            return true;
        }
        else{
            return false;
        }
    }

    public int isBalanced(TreeNode A) {

        return isBalanced(A, new Height(0)) ? 1 : 0;
    }
}
