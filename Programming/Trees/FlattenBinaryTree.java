package Trees;

/**
 * Author - archit.s
 * Date - 10/11/18
 * Time - 12:34 AM
 */
public class FlattenBinaryTree {

    public TreeNode flatten(TreeNode a) {

        if(a == null){
            return a;
        }

        TreeNode cur = a;

        while(cur!=null){

            if(cur.left!=null){
                TreeNode rightMost = cur.left;

                while(rightMost.right!=null){
                    rightMost = rightMost.right;
                }

                rightMost.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }

            cur = cur.right;
        }

        return a;
    }
}
