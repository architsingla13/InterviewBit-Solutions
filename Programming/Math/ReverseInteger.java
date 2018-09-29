package Math;

/**
 * Author - archit.s
 * Date - 29/09/18
 * Time - 12:53 PM
 */
public class ReverseInteger {

    public int reverse(int A) {

        boolean flag = false;
        if(A < 0){
            flag = true;
            A = -1 * A;
        }

        long t = 0;
        while(A > 0){
            t *= 10;
            t += A%10;
            if(t > Integer.MAX_VALUE){
                return 0;
            }
            A /= 10;
        }

        if(flag){
            t *= -1;
        }

        return (int)t;
    }

}
