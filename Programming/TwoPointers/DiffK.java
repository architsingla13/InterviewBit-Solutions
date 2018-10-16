package TwoPointers;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 16/10/18
 * Time - 11:07 AM
 */
public class DiffK {
    public int diffPossible(ArrayList<Integer> A, int B) {

        int i = 0;
        int j = 1;

        while(i!=A.size() && j!= A.size()){
            if(i == j){
                j++;
                continue;
            }

            int diff = A.get(j) - A.get(i);
            if(diff == B){
                return 1;
            }
            else if(diff > B){
                i++;
            }
            else{
                j++;
            }
        }

        return 0;
    }
}
