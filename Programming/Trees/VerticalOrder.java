package Trees;

import java.util.*;

/**
 * Author - archit.s
 * Date - 04/11/18
 * Time - 6:12 PM
 */
public class VerticalOrder {

    class Pair{
        TreeNode t;
        int d;

        Pair(TreeNode t, int d){
            this.d = d;
            this.t = t;
        }
    }

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {

        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        Map<Integer, ArrayList<Integer> > map = new HashMap<>();

        Queue<Pair> q = new LinkedList<>();

        if(A == null){
            return r;
        }

        int leftD = 0;
        int rightD = 0;

        Pair p = new Pair(A,0);
        q.add(p);
        while(!q.isEmpty()){

            Pair pTemp = q.remove();

            leftD = Math.min(leftD, pTemp.d);
            rightD = Math.max(rightD, pTemp.d);

            ArrayList<Integer> temp;
            if(map.containsKey(pTemp.d)){
                temp = map.get(pTemp.d);
            }
            else{
                temp = new ArrayList<>();
            }
            temp.add(pTemp.t.val);
            map.put(pTemp.d,temp);

            if(pTemp.t.left!=null){
                q.add(new Pair(pTemp.t.left, pTemp.d-1));
            }
            if(pTemp.t.right!=null){
                q.add(new Pair(pTemp.t.right, pTemp.d+1));
            }

        }

        for(int i=leftD;i<=rightD;i++){
            r.add(map.get(i));
        }

        return r;
    }
}
