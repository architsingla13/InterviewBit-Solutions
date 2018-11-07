package Trees;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 06/11/18
 * Time - 11:06 PM
 */
public class BinaryTreeFromPreAndInorder {

    class Index{
        int index;

        public Index(int idx){
            this.index = idx;
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

    public TreeNode helper(ArrayList<Integer> preorder, ArrayList<Integer> inorder, Index idx,
                           int start, int end){

        if(start > end){
            return null;
        }

        TreeNode root = new TreeNode(preorder.get(idx.index));

        int rootIndex = search(inorder,preorder.get(idx.index),start,end);
        idx.index+=1;

        root.left = helper(preorder,inorder,idx, start, rootIndex-1);
        root.right = helper(preorder,inorder,idx, rootIndex+1, end);

        return root;
    }

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {

        Index idx = new Index(0);
        return helper(A,B,idx,0,A.size()-1);
    }
}
