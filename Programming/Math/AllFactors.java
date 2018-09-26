package Math;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 26/09/18
 * Time - 11:57 AM
 */
public class AllFactors {

    //Note: Can also be solved by maintaining 2 arrays, one with adding i to last of list and other adding A/i(if A/i != i) first to list

    public ArrayList<Integer> allFactors(int A) {

        ArrayList<Integer> ans = new ArrayList<>();
        int checkN = (int)Math.sqrt(A);


        int count = 0;
        for(int i = 1; i<= checkN; i++){
            if(A%i == 0){
                ans.add(count, i);
                if(A/i != i){
                    ans.add(ans.size()-count, A/i);
                }
                count++;
            }
        }

        return ans;
    }
}
