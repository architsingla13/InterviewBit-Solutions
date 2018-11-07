package Trees;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 07/11/18
 * Time - 1:15 PM
 */
public class TwoSumBinaryTree {

    public int t2Sum(TreeNode A, int B) {

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        int v1 = 0, v2 = 0;
        boolean done1 = false, done2 = false;

        TreeNode cur1 = A, cur2 = A;

        while(true){

            while(!done1){
                if(cur1!=null){
                    s1.push(cur1);
                    cur1 = cur1.left;
                }
                else{
                    if(s1.empty()){
                        done1 = true;
                    }
                    else{
                        cur1 = s1.pop();
                        v1 = cur1.val;
                        cur1 = cur1.right;
                        done1 = true;
                    }
                }
            }

            while(!done2){
                if(cur2!=null){
                    s2.push(cur2);
                    cur2 = cur2.right;
                }
                else{
                    if(s2.empty()){
                        done2 = true;
                    }
                    else{
                        cur2 = s2.pop();
                        v2 = cur2.val;
                        cur2 = cur2.left;
                        done2 = true;
                    }
                }
            }

            if((v1!=v2) && (v1+v2 == B)){
                return 1;
            }
            else if(v1+v2<B){
                done1 = false;
            }
            else if(v1+v2>B){
                done2 = false;
            }

            if(v1 >= v2){
                return 0;
            }
        }

    }
}
