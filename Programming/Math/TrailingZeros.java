package Math;

/**
 * Author - archit.s
 * Date - 29/09/18
 * Time - 6:11 PM
 */
public class TrailingZeros {
    public int trailingZeroes(int A) {

        int ans = 0;
        for(int i=5;A/i>=1;i*=5){
            ans += A/i;
        }

        return ans;
    }
}
