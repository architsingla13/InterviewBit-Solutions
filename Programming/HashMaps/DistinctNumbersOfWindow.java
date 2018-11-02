package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 02/11/18
 * Time - 11:03 AM
 */
public class DistinctNumbersOfWindow {

    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

        ArrayList<Integer> r = new ArrayList<>();
        if(B>A.size()){
            return r;
        }

        Map<Integer,Integer> map = new HashMap<>();
        int distinct = 0;
        int i = 0;
        while(i<B){
            int value = A.get(i);
            if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
            }
            else{
                map.put(value,1);
                distinct++;
            }
            i++;
        }

        r.add(distinct);

        while(i<A.size()){
            int value = A.get(i-B);
            int count = map.getOrDefault(value,0);

            if(count==1){
                map.put(value,0);
                distinct--;
            }
            else if(count > 1){
                map.put(value,count-1);
            }

            value = A.get(i);
            count = map.getOrDefault(value,0);
            if(count == 0){
                distinct++;
            }
            map.put(value,count+1);

            r.add(distinct);
            i++;
        }

        return r;
    }
}
