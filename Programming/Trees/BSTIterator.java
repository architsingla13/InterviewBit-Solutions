package Trees;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 07/11/18
 * Time - 1:41 PM
 */
public class BSTIterator {

    Stack<TreeNode> s;
    TreeNode curr;

    public BSTIterator(TreeNode root) {
        s = new Stack<>();

        curr = root;
        while(curr!=null){
            s.push(curr);
            curr = curr.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {

        return !s.empty();
    }

    /** @return the next smallest number */
    public int next() {

        curr = s.pop();
        int value = curr.val;
        curr = curr.right;
        while(curr!=null){
            s.push(curr);
            curr = curr.left;
        }

        return value;
    }
}
