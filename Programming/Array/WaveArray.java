package Array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author - archit.s
 * Date - 27/08/18
 * Time - 1:37 PM
 */
public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {

        Collections.sort(A);

        for(int i=0;i<A.size()-1;i+=2){
            int a = A.get(i);
            int b = A.get(i+1);

            A.set(i, b);
            A.set(i+1, a);
        }

        return A;
    }
}
