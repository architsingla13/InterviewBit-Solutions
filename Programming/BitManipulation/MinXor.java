package BitManipulation;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author - archit.s
 * Date - 12/10/18
 * Time - 12:22 PM
 */
public class MinXor {

    public int findMinXor(ArrayList<Integer> A) {

        Collections.sort(A);

        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++){
            int temp = A.get(i) ^ A.get(i+1);
            if(temp < min){
                min = temp;
            }
        }

        return min;
    }

}
