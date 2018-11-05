package Trees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 04/11/18
 * Time - 11:14 PM
 */
public class PostOrder {

    public ArrayList<Integer> postorderTraversal(TreeNode A) {

        Stack<TreeNode> s = new Stack<>();

        TreeNode lastVisited = null;
        ArrayList<Integer> r = new ArrayList<>();

        while(!s.empty() || A!=null){

            if(A!=null){
                s.push(A);
                A = A.left;
            }
            else{
                TreeNode topNode = s.peek();
                if(topNode.right!=null && topNode.right!=lastVisited){
                    A = topNode.right;
                }
                else{
                    r.add(topNode.val);
                    lastVisited = s.pop();
                }
            }

        }

        return r;
    }
}
