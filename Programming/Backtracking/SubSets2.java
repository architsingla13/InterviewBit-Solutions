package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 27/10/18
 * Time - 1:02 PM
 */
public class SubSets2 {

    public void addSubsets(ArrayList<Integer> A, int pos, Map<ArrayList<Integer>,Boolean> map,
                           ArrayList<Integer> temp){

        if(!map.containsKey(temp)){
            map.put(new ArrayList<>(temp), true);
        }

        for(int i=pos;i<A.size();i++){
            temp.add(A.get(i));
            addSubsets(A,i+1,map,temp);
            temp.remove(temp.size()-1);
        }
    }

    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {

        Map<ArrayList<Integer>,Boolean> map = new LinkedHashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Collections.sort(A);

        addSubsets(A,0,map,temp);

        return new ArrayList<>(map.keySet());
    }
}
