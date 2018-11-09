package Trees;

/**
 * Author - archit.s
 * Date - 08/11/18
 * Time - 10:48 PM
 */
public class SumRootToLeafNumbers {

    public int helper(TreeNode A, int val){

        if(A == null){
            return 0;
        }

        val = ((val%1003*10)%1003 + (A.val)%1003)%1003;

        if(A.left == null && A.right == null){
            return val;
        }

        return (helper(A.left,val) + helper(A.right, val))%1003;
    }


    public int sumNumbers(TreeNode A) {

        return helper(A,0);
    }
}
