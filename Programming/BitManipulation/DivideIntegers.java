package BitManipulation;

/**
 * Author - archit.s
 * Date - 13/10/18
 * Time - 1:07 PM
 */
public class DivideIntegers {

    public int divide(int A, int B) {

        long sign =((A < 0 ) ^ (B < 0)) ? -1 : 1;

        long dividend, divisor;

        dividend = Math.abs(Long.valueOf(A));
        divisor = Math.abs(Long.valueOf(B));

        long quotient = 0, temp = 0;
        for(int i=31; i>=0;i--){

            if(temp + (divisor << i) <= dividend){
                temp += divisor <<i;
                quotient |= 1L <<i;
            }
        }

        quotient = quotient*sign;
        return (quotient > Integer.MAX_VALUE || quotient < Integer.MIN_VALUE) ? Integer.MAX_VALUE : (int) quotient;
    }

    public static void main(String[] args) {
        System.out.println(new DivideIntegers().divide(-2147483648,-1));
    }
}
