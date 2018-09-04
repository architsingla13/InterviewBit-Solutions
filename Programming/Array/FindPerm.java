package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 04/09/18
 * Time - 1:04 PM
 */
public class FindPerm {

    public ArrayList<Integer> findPerm(final String A, int B) {

        ArrayList<Integer> r = new ArrayList<>();
        int low = 1, high = B;

        for(int i=0;i<B-1;i++){
            if(A.charAt(i) == 'I'){
                r.add(low);
                low++;
            }
            else{
                r.add(high);
                high--;
            }
        }
        r.add(low);
        return r;
    }
}
