package Array;

import java.util.Arrays;
import java.util.List;

/**
 * Author - archit.s
 * Date - 01/09/18
 * Time - 2:35 PM
 */
public class MaxConsGap {


    public int maximumGap(final List<Integer> A) {

        if(A.size()<2){
            return 0;
        }

        int min = A.get(0);
        int max = A.get(0);

        for(int i=1;i<A.size();i++){
            min = Math.min(min,A.get(i));
            max = Math.max(max, A.get(i));
        }

        double gap = 0;
        gap = max - min;
        gap = gap/(A.size()-1);

        if(gap == 0){
            return max - min;
        }

        int[] maxArray = new int[A.size()];
        int[] minArray = new int[A.size()];
        Arrays.fill(minArray, Integer.MAX_VALUE);
        Arrays.fill(maxArray, Integer.MIN_VALUE);
        int bucket = 0;

        for(int i=0;i<A.size();i++){
            bucket = (int)((A.get(i)-min)/gap);

            if(minArray[bucket] == Integer.MAX_VALUE){
                minArray[bucket] = A.get(i);
            }
            else{
                minArray[bucket] = Math.min(minArray[bucket], A.get(i));
            }

            if(maxArray[bucket] == Integer.MIN_VALUE){
                maxArray[bucket] = A.get(i);
            }
            else{
                maxArray[bucket] = Math.max(maxArray[bucket], A.get(i));
            }
        }

        int result = 0;
        int ind = 0;

        for(int i=0;i<A.size();i++){
            if(minArray[i] != Integer.MAX_VALUE){
                result = Math.max(result, minArray[i] - maxArray[ind]);
                ind = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MaxConsGap().maximumGap(Arrays.asList(1,10,5)));
    }
}
