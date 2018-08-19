package Array;

import java.util.ArrayList;

/**
 * Author - archit.s
 * Date - 19/08/18
 * Time - 7:12 PM
 */
public class Flip {


// Solution approach
//    Note what is the net change in number of 1s in string S when we flip bits of string S.
//    Say it has A 0s and B 1s. Eventually, there are B 0s and A 1s.
//
//    So, number of 1s increase by A - B. We want to choose a subarray which maximises this.
//    Note, if we change 1s to -1, then sum of values will give us A - B.
//    Then, we have to find a subarray with maximum sum, which can be done via Kadane’s Algorithm.

    public ArrayList<Integer> flip(String A) {

        ArrayList<Integer> result = new ArrayList<>();
        int L = 0;

        int left = -1, right = -1;

        int maxZeroes = 0;
        int zeroes = 0;
        int ones = 0;
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == '0'){
                zeroes++;
            }
            else{
                ones++;
            }

            if(zeroes - ones < 0){
                zeroes = ones = 0;
                L = i+1;
            }

            if (zeroes - ones > maxZeroes){
                maxZeroes = zeroes - ones;
                left = L;
                right = i;
            }
        }

        if(maxZeroes > 0){
            result.add(left+1);
            result.add(right+1);
        }

        return result;

    }

}
