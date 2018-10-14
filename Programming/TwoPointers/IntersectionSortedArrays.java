package TwoPointers;

import java.util.ArrayList;
import java.util.List;

/**
 * Author - archit.s
 * Date - 14/10/18
 * Time - 9:31 PM
 */
public class IntersectionSortedArrays {

    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {

        ArrayList<Integer> r = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<A.size() || j<B.size()){
            int v1 = i<A.size() ? A.get(i) : Integer.MAX_VALUE;
            int v2 = j<B.size() ? B.get(j) : Integer.MAX_VALUE;

            if(v1 < v2){
                i++;
            }
            else if(v2 < v1){
                j++;
            }
            else{
                r.add(v1);
                i++;
                j++;
            }
        }

        return r;
    }

}
