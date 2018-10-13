package BitManipulation;

import java.util.List;

/**
 * Author - archit.s
 * Date - 13/10/18
 * Time - 12:49 PM
 */
public class SingleNumber2 {
    public int singleNumber(final List<Integer> A) {
        int ones = 0, twos = 0;
        int commonBits = 0;

        for (Integer aA : A) {

            twos |= (ones & aA);
            ones ^= aA;
            commonBits = ~(ones & twos);

            ones &= commonBits;
            twos &= commonBits;
        }

        return ones;
    }
}
