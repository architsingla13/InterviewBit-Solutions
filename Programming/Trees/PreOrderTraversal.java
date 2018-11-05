package Trees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 04/11/18
 * Time - 10:00 PM
 */
public class PreOrderTraversal {

    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        ArrayList<Integer> r = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        if(A == null){
            return r;
        }
        s.push(A);
        while(!s.empty()){

            A = s.pop();
            r.add(A.val);
            if(A.right!=null){
                s.push(A.right);
            }
            if(A.left!=null){
                s.push(A.left);
            }
        }

        return r;
    }
}
