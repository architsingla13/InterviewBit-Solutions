package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 28/10/18
 * Time - 3:10 PM
 */
public class TwoSum {

    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {

        int index1 = -1;
        int index2 = -1;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.size();i++){

            if(map.containsKey(A.get(i))){
                index1 = map.get(A.get(i));
                index2 = i;
                break;
            }
            else if(!map.containsKey(B-A.get(i))){
                map.put(B-A.get(i), i);
            }
        }

        ArrayList<Integer> r = new ArrayList<>();
        if(index1!=-1){
            r.add(index1+1);
            r.add(index2+1);
        }

        return r;
    }
}
