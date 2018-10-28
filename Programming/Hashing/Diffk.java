package Hashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author - archit.s
 * Date - 28/10/18
 * Time - 7:09 PM
 */
public class Diffk {

    public boolean isDiffPresent(List<Integer> A, int B){

        Set<Integer> s = new HashSet<>();

        for(int i=0;i<A.size();i++){

            int value = A.get(i);
            if(s.contains(value)){
                return true;
            }
            else{
                s.add(B+value);
                s.add(value-B);
            }
        }
        return false;
    }

    public int diffPossible(final List<Integer> A, int B) {

        if(isDiffPresent(A,B)){
            return 1;
        }
        return 0;
    }
}
