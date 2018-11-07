package Trees;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 07/11/18
 * Time - 6:57 PM
 */
public class RecoverBST {

    public ArrayList<Integer> recoverTree(TreeNode A) {

        TreeNode first = null, second = null;
        TreeNode prev = null, node1 = null , node2 = null;

        TreeNode cur = A;

        while(cur!=null){

            if(cur.left == null){

                if(node1 == null){
                    node1 = cur;
                }
                else if(node2 == null){
                    node2 = cur;
                }
                else{
                    node1 = node2;
                    node2 = cur;
                }

                cur = cur.right;
            }
            else{

                prev = cur.left;
                while(prev.right!=null && prev.right!=cur){
                    prev = prev.right;
                }

                if(prev.right == null){
                    prev.right = cur;
                    cur = cur.left;
                }
                else{

                    prev.right = null;
                    if(node1 == null){
                        node1 = cur;
                    }
                    else if(node2 == null){
                        node2 = cur;
                    }
                    else{
                        node1 = node2;
                        node2 = cur;
                    }

                    cur = cur.right;
                }
            }

            if(node1 != null && node2!= null && node1.val > node2.val){
                if(first == null){
                    first = node1;
                }
                second = node2;
            }
        }

        ArrayList<Integer> r = new ArrayList<>();

        r.add(Math.min(first.val, second.val));
        r.add(Math.max(first.val, second.val));

        return r;
    }
}
