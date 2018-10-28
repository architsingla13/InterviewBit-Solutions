package Math;

import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 30/09/18
 * Time - 12:25 PM
 */
public class SortRankRepeat {

    private static final int MOD = 1000003;

    long fact(long A){
        if(A <= 1){
            return 1;
        }

        return A*fact(A-1) % MOD;
    }

    long modInv(long A, long y){

        long res = 1;

        while(y>0){
            if((y & 1) == 1){
                res = (res*A) % MOD;
            }
            A = (A*A) % MOD;

            y >>= 1;
        }

        return res;
    }

    int smallerRight(String A, int low, int high){

        char c = A.charAt(low);
        int count = 0;
        for(int i=low+1;i<=high;i++){
            if(c > A.charAt(i)){
                count++;
            }
        }

        return count;
    }

    public int findRank(String A) {

        int len  = A.length();
        long[] facts = new long[len+1];
        long[] invFacts = new long[len+1];
        facts[0]  = invFacts[0] = 1;

        for(int i=1;i<=len;i++){
            facts[i] = (facts[i-1]*i) % MOD;
            invFacts[i] = modInv(facts[i], MOD-2);
        }

        long rank = 0;

        for(int i=0;i<len;i++){

            int smaller = smallerRight(A, i, len-1);
            int[] dupl = new int[52];

            Arrays.fill(dupl, 0);

            //count duplicates from that position to right
            for(int j=i;j<len;j++){
                if(A.charAt(j) >= 'A' && A.charAt(j) <= 'Z'){
                    dupl[A.charAt(j) - 'A']++;
                }
                else{
                    dupl[A.charAt(j) - 'a' + 26]++;
                }
            }


            long temp = smaller*fact(len-i-1);
            for(int j=0;j<52;j++){
                if(dupl[j] > 0){
                    temp = (temp * invFacts[dupl[j]]) % MOD;
                }
            }
            rank = (rank + temp) % MOD;

        }

        return new Long((rank+1) % MOD).intValue();
    }

    public static void main(String[] args) {
        System.out.println(new SortRankRepeat().findRank("baa"));
    }

}
