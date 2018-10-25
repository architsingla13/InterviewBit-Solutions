package Stacks;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 24/10/18
 * Time - 11:47 PM
 */
public class NearestSmaller {

    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {

        ArrayList<Integer> r = new ArrayList<>();
        if(A.size()==0){
            return r;
        }

        r.add(-1);
        Stack<Integer> s = new Stack<>();
        s.push(A.get(0));
        for(int i=1;i<A.size();i++){

            while(!s.empty() && s.peek()>=A.get(i)){
                s.pop();
            }

            if(s.empty()){
                r.add(-1);
            }
            else{
                r.add(s.peek());
            }
            s.push(A.get(i));
        }

        return r;
    }
}
