package Trees;

import java.util.List;

/**
 * Author - archit.s
 * Date - 05/11/18
 * Time - 4:11 PM
 */
public class SortedArrayToBalancedBST {

    public TreeNode helper(List<Integer> a , int start, int end){

        if(start>end){
            return null;
        }

        int mid = start + (end-start)/2;

        TreeNode root = new TreeNode(a.get(mid));

        root.left = helper(a,start,mid-1);
        root.right = helper(a,mid+1,end);

        return root;
    }

    public TreeNode sortedArrayToBST(final List<Integer> a) {

        return helper(a,0,a.size()-1);
    }
}
