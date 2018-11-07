package Trees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 07/11/18
 * Time - 12:01 AM
 */
public class KthSmallestInBst {

    public int kthsmallest(TreeNode A, int B) {

        ArrayList<Integer> sol = new ArrayList<>();

        Stack<TreeNode> s = new Stack<>();

        while(A!=null || !s.empty()){

            while(A!=null){
                s.push(A);
                A = A.left;
            }

            A = s.pop();
            sol.add(A.val);
            if(sol.size()==B){
                return sol.get(sol.size()-1);
            }
            A = A.right;
        }

        return sol.get(sol.size()-1);
    }
}
