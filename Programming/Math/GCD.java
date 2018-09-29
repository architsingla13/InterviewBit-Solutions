package Math;

/**
 * Author - archit.s
 * Date - 29/09/18
 * Time - 1:20 PM
 */
public class GCD {

    public int gcd(int A, int B) {

        if(A == 0){
            return B;
        }

        return gcd(B%A, A);
    }
}
