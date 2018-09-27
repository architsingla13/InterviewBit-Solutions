package Math;

import java.util.List;

/**
 * Author - archit.s
 * Date - 27/09/18
 * Time - 12:00 PM
 */
public class PairWiseHamming {

    public int hammingDistance(final List<Integer> A) {

        int ans = 0;

        for(int i=0;i<32;i++){

            int count = 0;
            for (Integer aA : A) {
                if ((aA & (1 << i)) != 0) {
                    count++;
                }
            }

            ans += (2L *count*(A.size() - count))% 1000000007;
            ans = ans % 1000000007;
        }

        return ans;
    }

}
