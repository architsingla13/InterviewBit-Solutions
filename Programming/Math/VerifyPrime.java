package Math;

/**
 * Author - archit.s
 * Date - 27/09/18
 * Time - 11:42 AM
 */
public class VerifyPrime {
    public int isPrime(int A) {

        if( A == 0 || A == 1){
            return 0;
        }

        for(int i=2; i*i <= A ;i++){
            if(A%i == 0){
                return 0;
            }
        }

        return 1;
    }
}
