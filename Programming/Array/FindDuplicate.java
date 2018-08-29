package Array;

import java.util.List;

/**
 * Author - archit.s
 * Date - 29/08/18
 * Time - 12:28 PM
 */
public class FindDuplicate {
    public int repeatedNumber(final List<Integer> a) {

        int t = 0;

        for(int i=0;i<a.size();i++){
            t ^= a.get(i);
        }

        for(int i=1;i<=a.size()-1;i++){
            t ^= i;
        }
        return t;
    }
}
