package Stacks;

import java.util.ArrayList;
import java.util.List;

/**
 * Author - archit.s
 * Date - 25/10/18
 * Time - 2:00 PM
 */
public class RainWaterTrapped {

    public int trap(final List<Integer> A) {

        ArrayList<Integer> left = new ArrayList<>(A.size());
        ArrayList<Integer> right = new ArrayList<>(A.size());

        if(A.size() ==0 ){
            return 0;
        }

        for(int i=0;i<A.size();i++){
            left.add(0);
            right.add(0);
        }

        left.set(0,A.get(0));

        for(int i=1;i<A.size();i++){
            left.set(i, Math.max(A.get(i), left.get(i-1)));
        }

        right.set(A.size()-1, A.get(A.size()-1));
        for(int i=A.size()-2;i>=0;i--){
            right.set(i, Math.max(A.get(i), right.get(i+1)));
        }

        int area = 0;

        for(int i=0;i<A.size();i++){

            area += Math.min(left.get(i), right.get(i)) - A.get(i);
        }

        return area;
    }
}
