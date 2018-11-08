package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author - archit.s
 * Date - 08/11/18
 * Time - 1:00 PM
 */
public class ZigZagOrder {

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {

        Queue<TreeNode> q = new LinkedList<>();

        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        if(A == null){
            return r;
        }

        q.add(A);
        int count = 1;
        boolean flag = true;
        while(!q.isEmpty()){

            int tempCount = count;
            count = 0;
            ArrayList<Integer> mid = new ArrayList<>();
            while(tempCount > 0){
                tempCount--;
                TreeNode t = q.remove();
                if(t.left != null) {
                    q.add(t.left);
                    count++;
                }
                if(t.right!=null){
                    q.add(t.right);
                    count++;
                }
                mid.add(t.val);
            }
            if(!flag){
                Collections.reverse(mid);
            }

            r.add(mid);
            flag = !flag;
        }

        return r;
    }
}
