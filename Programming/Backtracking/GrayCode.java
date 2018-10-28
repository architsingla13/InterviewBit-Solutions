package Backtracking;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 27/10/18
 * Time - 10:41 PM
 */
public class GrayCode {

    class IntWrapper{
        int value;

        public IntWrapper(int value) {
            this.value = value;
        }
    }

    public void helper(ArrayList<Integer> r, int n, IntWrapper num){

        if(n == 0){
            r.add(new IntWrapper(num.value).value);
            return;
        }

        helper(r,n -1, num);
        num.value = num.value ^ (1<<(n-1));
        helper(r,n-1,num);
    }

    public ArrayList<Integer> grayCode(int a) {

        ArrayList<Integer> r = new ArrayList<>();
        IntWrapper wrapper = new IntWrapper(0);
        helper(r,a,wrapper);
        return r;
    }

    public static void main(String[] args) {
        System.out.println(new GrayCode().grayCode(2));
    }
}
