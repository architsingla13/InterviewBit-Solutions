package BitManipulation;

import java.util.List;

/**
 * Author - archit.s
 * Date - 12/10/18
 * Time - 12:26 PM
 */
public class SingleNumber {
    public int singleNumber(final List<Integer> A) {

        int v = 0;
        for(int i=0;i<A.size();i++){
            v ^= A.get(i);
        }

        return v;
    }
}
