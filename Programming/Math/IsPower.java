package Math;

/**
 * Author - archit.s
 * Date - 28/09/18
 * Time - 12:48 PM
 */
public class IsPower {

    public int isPower(int A) {

        if(A == 1){
            return 1;
        }

        for(int i=2;i<=Math.sqrt(A);i++){
            int p = A;

            while(p%i == 0){
                p /= i;
            }
            if(p == 1){
                return 1;
            }
        }

        return 0;
    }
}
