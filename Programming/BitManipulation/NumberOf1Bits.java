package BitManipulation;

/**
 * Author - archit.s
 * Date - 12/10/18
 * Time - 12:31 PM
 */
public class NumberOf1Bits {

    // 1st Solution
    /*public int numSetBits(long a) {

        int i=1;
        int count = 0;
        while(i<=32){
            if((a&1) == 1){
                count++;
            }
            i++;
        }

        return count;
    }*/

    public int numSetBits(long a) {

        int count = 0;
        while(a!=0){
            a = (a & (a-1));
            count++;
        }

        return count;
    }
}
