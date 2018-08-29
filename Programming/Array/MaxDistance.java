package Array;

import java.util.List;

/**
 * Author - archit.s
 * Date - 29/08/18
 * Time - 1:29 PM
 */
public class MaxDistance {
    public int maximumGap(final List<Integer> A) {

        int[] left = new int[A.size()];
        int[] right =  new int[A.size()];

        left[0]= A.get(0);
        for(int i=1;i<A.size();i++){
            left[i] = Math.min(A.get(i), left[i-1]);
        }
        right[A.size()-1] = A.get(A.size()-1);
        for(int i=A.size()-2;i>=0;i--){
            right[i] = Math.max(A.get(i), right[i+1]);
        }

        int max = 0;
        int i=0,j=0;

        while(i<A.size() && j<A.size()){
            if(left[i] <= right[j]){
                max = Math.max(max, j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return max;
    }
}
