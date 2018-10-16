package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author - archit.s
 * Date - 16/10/18
 * Time - 11:30 AM
 */
public class ThreeSum {

    public int threeSumClosest(ArrayList<Integer> A, int B) {

        int minDiff = Integer.MAX_VALUE;
        int sum = 0;

        Collections.sort(A);

        for(int i=0;i<A.size()-2;i++){
            int j=i+1;
            int k = A.size()-1;

            while(j<k){

                int temp = A.get(i) + A.get(k) + A.get(j);
                int min = Math.abs(temp - B);

                if(temp == B){
                    return B;
                }

                if(min < minDiff ){
                    minDiff = min;
                    sum = temp;
                }

                if(temp < B){
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        return sum;
    }
}
