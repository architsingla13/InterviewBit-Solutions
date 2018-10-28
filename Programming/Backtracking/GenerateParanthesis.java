package Backtracking;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 27/10/18
 * Time - 4:14 PM
 */
public class GenerateParanthesis {

    public void helper(ArrayList<String> r, int left, int right, StringBuilder temp){

        if(left>right){
            return;
        }
        else if(left ==0 && right == 0){
            r.add(new String(temp));
            return;
        }

        for(int i=0;i<2;i++){
            if(i==0 && left!=0){
                temp.append('(');
                helper(r,left-1,right,temp);
                temp.deleteCharAt(temp.length()-1);
            }
            else if(i == 1 && right !=0 ){
                temp.append(')');
                helper(r,left,right-1,temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public ArrayList<String> generateParenthesis(int A) {

        ArrayList<String> r = new ArrayList<>();
        StringBuilder s = new StringBuilder();

        helper(r,A,A,s);

        return r;
    }
}
