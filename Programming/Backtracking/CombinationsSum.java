package Backtracking;

import java.util.*;

/**
 * Author - archit.s
 * Date - 27/10/18
 * Time - 11:51 AM
 */
public class CombinationsSum {

    public void addMatchComb(ArrayList<ArrayList<Integer>> r, ArrayList<Integer> input, int pos ,
                             int currentSum,  int reqSum, ArrayList<Integer> temp, Map<ArrayList<Integer>, Boolean> map){

        if(currentSum == reqSum && !map.containsKey(temp)){
            ArrayList<Integer> t = new ArrayList<>(temp);
            r.add(t);
            map.put(t, true);
            return;
        }else if(currentSum > reqSum){
            return;
        }

        for(int i=pos;i<input.size();i++){
            currentSum += input.get(i);
            temp.add(input.get(i));
            addMatchComb(r,input,i,currentSum,reqSum,temp,map);
            currentSum-=input.get(i);
            temp.remove(temp.size()-1);
        }
    }

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {

        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        Map<ArrayList<Integer>, Boolean> map = new HashMap<>();
        Collections.sort(A);

        addMatchComb(r,A,0,0,B,temp,map);

        return r;
    }
}
