package Math;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 27/09/18
 * Time - 11:35 AM
 */
public class Prime {

    public ArrayList<Integer> sieve(int A) {

        ArrayList<Integer> ans = new ArrayList<>();

        boolean prime[] = new boolean[A+1];
        for(int i=0;i<=A;i++){
            prime[i] = true;
        }

        for(int p=2; p*p<= A; p++){

            if(prime[p]){
                for(int j=2*p;j<=A;j+=p){
                    prime[j] = false;
                }
            }
        }

        for(int i=2;i<=A;i++){
            if(prime[i]){
                ans.add(i);
            }
        }

        return ans;
    }
}
