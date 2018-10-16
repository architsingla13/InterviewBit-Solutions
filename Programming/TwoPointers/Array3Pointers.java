package TwoPointers;

import java.util.List;

/**
 * Author - archit.s
 * Date - 16/10/18
 * Time - 12:44 PM
 */
public class Array3Pointers {

    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {

        int i=0;
        int j=0;
        int k=0;

        int min_diff = Math.abs(Math.max(A.get(i), Math.max(B.get(j), C.get(k))) - Math.min(A.get(i), Math.min(B.get(j), C.get(k))));

        while(i<A.size() && j<B.size() && k<C.size()){

            int max = Math.max(A.get(i), Math.max(B.get(j), C.get(k)));
            int min = Math.min(A.get(i), Math.min(B.get(j), C.get(k)));
            int current = Math.abs(max - min);

            if(current < min_diff){
                min_diff = current;
            }

            if(min == A.get(i)){
                i++;
            }
            else if(min == B.get(j)){
                j++;
            }
            else{
                k++;
            }
        }

        return min_diff;
    }
}
