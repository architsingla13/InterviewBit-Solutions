package Trees;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 08/11/18
 * Time - 11:15 PM
 */
public class RootToLeafPathSum {

    public void helper(TreeNode A, int B, ArrayList<Integer> t, ArrayList<ArrayList<Integer>> r ){

        if(B == 0 && A.left == null && A.right == null){
            r.add(new ArrayList<>(t));
        }

        if(A.left!=null){
            t.add(A.left.val);
            helper(A.left, B-A.left.val,t,r);
            t.remove(t.size()-1);
        }
        if(A.right!=null){
            t.add(A.right.val);
            helper(A.right, B - A.right.val, t,r);
            t.remove(t.size()-1);
        }
    }

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {

        ArrayList<ArrayList<Integer>> r = new ArrayList<>();

        if(A == null){
            return r;
        }

        ArrayList<Integer> t = new ArrayList<>();
        t.add(A.val);

        helper(A,B-A.val,t,r);

        return r;
    }
}
