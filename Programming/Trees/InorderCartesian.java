package Trees;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 05/11/18
 * Time - 1:37 PM
 */
public class InorderCartesian {

    //Max Element
    public int getRoot(ArrayList<Integer> A, int s, int e){

        int ans = s;
        for(int i=s;i<=e;i++){

            if(A.get(i) > A.get(ans)){
                ans = i;
            }
        }

        return ans;
    }

    public TreeNode build(ArrayList<Integer> A, int start, int end){

        if(start > end){
            return null;
        }

        int max = getRoot(A,start,end);
        TreeNode root = new TreeNode(A.get(max));

        root.left = build(A,start,max-1);
        root.right = build(A,max+1,end);

        return root;
    }

    public TreeNode buildTree(ArrayList<Integer> A) {

        return build(A,0,A.size()-1);
    }
}
