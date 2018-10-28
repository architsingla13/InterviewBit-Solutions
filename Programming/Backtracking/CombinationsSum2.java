package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 27/10/18
 * Time - 12:51 PM
 */
public class CombinationsSum2 {

    public void addCombSum(ArrayList<ArrayList<Integer>> r, ArrayList<Integer> input, int pos,
                           int currentSum, int reqSum, ArrayList<Integer> temp, Map<ArrayList<Integer>,Boolean> map){

        if(currentSum == reqSum){
            if(!map.containsKey(temp)){
                ArrayList<Integer> t = new ArrayList<>(temp);
                r.add(t);
                map.put(t,true);
            }
            return;
        }
        else if(currentSum > reqSum){
            return;
        }

        for(int i=pos;i<input.size();i++){
            currentSum += input.get(i);
            temp.add(input.get(i));
            addCombSum(r,input,i+1,currentSum,reqSum,temp,map);
            currentSum -= input.get(i);
            temp.remove(temp.size()-1);
        }
    }

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {

        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        Collections.sort(a);
        Map<ArrayList<Integer>,Boolean> map = new HashMap<>();

        addCombSum(r,a,0,0,b,temp,map);

        return r;
    }
}
