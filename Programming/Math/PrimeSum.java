package Math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Author - archit.s
 * Date - 27/09/18
 * Time - 11:45 AM
 */
public class PrimeSum {
    public ArrayList<Integer> primesum(int A) {
        Set<Integer> s = new HashSet<>();

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
                s.add(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=2;i<=A;i++) {
            if(s.contains(i) && s.contains(A-i)){
                ans.add(i);
                ans.add(A-i);
                break;
            }
        }

        return ans;
    }
}
