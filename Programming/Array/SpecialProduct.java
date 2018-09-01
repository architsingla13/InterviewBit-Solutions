package Array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 01/09/18
 * Time - 6:23 PM
 */
public class SpecialProduct {

    private ArrayList<Integer> leftSpecialV(ArrayList<Integer> A){

        ArrayList<Integer> r = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<A.size();i++){
            while(!s.empty() && A.get(s.peek()) <= A.get(i)){
                s.pop();
            }

            if(s.empty()){
                r.add(0);
            }
            else{
                r.add(s.peek());
            }
            s.push(i);
        }

        return r;
    }

    private ArrayList<Integer> rightSpecialV(ArrayList<Integer> A){

        ArrayList<Integer> r = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=A.size()-1;i>=0;i--){
            while(!s.empty() && A.get(s.peek()) <= A.get(i)){
                s.pop();
            }

            if(s.empty()){
                r.add(0,0);
            }
            else{
                r.add(0,s.peek());
            }
            s.push(i);
        }

        return r;
    }

    public int maxSpecialProduct(ArrayList<Integer> A) {
        ArrayList<Integer> l = leftSpecialV(A);
        ArrayList<Integer> r = rightSpecialV(A);

        long product=0, res= 0;

        for(int i=0;i<A.size();i++){
            res= (long)l.get(i) * (long)r.get(i);
            if(product < res){
                product  = res;
            }
        }

        return (int)(product%1000000007);
    }
}
