package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Author - archit.s
 * Date - 19/08/18
 * Time - 6:32 PM
 */
public class RepeatMissing {

    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        long AMinusB = 0;
        long AsqMinusBsq = 0;

        for (int i = 1; i <= A.size(); i++) {
            AMinusB += A.get(i-1) - i;
            AsqMinusBsq += (long)A.get(i-1)*A.get(i-1) - (long)i*i;
        }

        long AplusB = AsqMinusBsq / AMinusB;

        ArrayList<Integer> result = new ArrayList<>();
        long a = (AMinusB + AplusB)/2;
        result.add((int)a);
        result.add((int)AplusB - (int)a);

        return result;
    }


}
