package Trees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 04/11/18
 * Time - 9:45 PM
 */
public class InorderTraversal {

    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        ArrayList<Integer> r = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        if(A == null){
            return r;
        }

        while(A!=null || !s.empty()){

            while(A!=null){
                s.push(A);
                A = A.left;
            }

            A = s.peek();
            s.pop();
            r.add(A.val);
            A = A.right;
        }

        return r;
    }
}
