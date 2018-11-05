package Trees;

/**
 * Author - archit.s
 * Date - 04/11/18
 * Time - 5:12 PM
 */
public class InorderSucc {

    public TreeNode getSuccessor(TreeNode a, int b) {

        TreeNode succ = null;
        TreeNode cur = a;

        while(cur!=null && cur.val!=b){

            if(cur.val > b){
                succ = cur;
                cur = cur.left;
            }
            else{
                cur = cur.right;
            }
        }

        if(cur == null){
            return null;
        }

        if(cur.right != null){
            TreeNode t = cur.right;
            while(t.left!=null){
                t = t.left;
            }

            return t;
        }
        else{
            return succ;
        }
    }
}
