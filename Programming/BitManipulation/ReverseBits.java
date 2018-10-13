package BitManipulation;

/**
 * Author - archit.s
 * Date - 13/10/18
 * Time - 12:02 PM
 */
public class ReverseBits {

    // First approach
    /*public long reverse(long a) {

        long num = 0;

        int i=0;
        while(a > 0){
            num += Math.pow(2, 31-i)*(a%2);
            a/=2;
            i++;
        }

        return num;
    }*/

    public long reverse(long a) {

        long num = 0;

        int i=0;
        while(i < 32){
            num <<= 1;
            if((a & (1<<i)) !=0){
                num |=1;
            }
            i++;
        }

        return num;
    }
}
