package Math;

/**
 * Author - archit.s
 * Date - 30/09/18
 * Time - 11:31 AM
 */
public class LargestCoPrime {

    int gcd(int x, int y){
        if(x == 0){
            return y;
        }

        return gcd(y%x, x);
    }

    public int cpFact(int A, int B) {

        while(gcd(A,B) != 1){
            A /= gcd(A,B);
        }
        return A;
    }

}
