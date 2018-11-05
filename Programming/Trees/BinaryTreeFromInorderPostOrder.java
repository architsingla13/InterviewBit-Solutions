package Trees;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 05/11/18
 * Time - 4:36 PM
 */
public class BinaryTreeFromInorderPostOrder {

    class Index{
        int index;
        public Index(int index){
            this.index = index;
        }
    }

    public int search(ArrayList<Integer> A, int value, int start, int end){

        for(int i=start;i<=end;i++){
            if(A.get(i) == value){
                return i;
            }
        }

        return -1;
    }

    public TreeNode helper(ArrayList<Integer> inorder, ArrayList<Integer> postorder,
                           Index idx, int start, int end){

        if(start > end){
            return null;
        }

        int t = search(inorder, postorder.get(idx.index), start, end);
        idx.index-=1;

        TreeNode root = new TreeNode(inorder.get(t));

        root.right = helper(inorder,postorder, idx,t+1,end);
        root.left = helper(inorder,postorder, idx,start,t-1);

        return root;
    }

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {

        Index i = new Index(A.size()-1);
        return helper(A,B,i,0,A.size()-1);
    }
}
