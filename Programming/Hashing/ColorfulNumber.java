package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 28/10/18
 * Time - 2:01 PM
 */
public class ColorfulNumber {

    public int colorful(int A) {

        Map<Long, Boolean> map = new HashMap<>();

        ArrayList<Long> r = new ArrayList<>();
        while(A>0){
            r.add(0, (long) (A%10));
            A/=10;
        }

        for(int i=0;i<r.size();i++){
            long product = 1;
            for(int j=i;j<r.size();j++){
                product *= r.get(j);
                if(!map.containsKey(product)){
                    map.put(product,true);
                }
                else{
                    return 0;
                }
            }
        }

        return 1;

    }
}
