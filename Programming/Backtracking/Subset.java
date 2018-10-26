package Backtracking;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author - archit.s
 * Date - 26/10/18
 * Time - 12:16 PM
 */
public class Subset {

    public void addSubsets(ArrayList<ArrayList<Integer>> r, ArrayList<Integer> A, int pos, ArrayList<Integer> temp){

        ArrayList<Integer> value = new ArrayList<>(temp);
        r.add(value);

        for(int i=pos;i<A.size();i++){
            temp.add(A.get(i));
            addSubsets(r,A,i+1,temp);
            temp.remove(temp.size()-1);
        }

    }

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

        Collections.sort(A);
        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        addSubsets(r,A,0,temp);

        return r;
    }
}
