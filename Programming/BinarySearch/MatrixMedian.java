package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 02/10/18
 * Time - 12:16 PM
 */
public class MatrixMedian {

    public int findMedian(ArrayList<ArrayList<Integer>> A) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int r = A.size();
        int c = A.get(0).size();

        int desired = (r*c+1)/2;

        for (ArrayList<Integer> aA : A) {
            for (int j = 0; j < c; j++) {
                if (aA.get(j) < min) {
                    min = aA.get(j);
                }
                if (aA.get(j) > max) {
                    max = aA.get(j);
                }
            }
        }

        while(min < max){
            int place = 0;

            int mid = min + (max-min)/2;
            int get = 0;

            for (ArrayList<Integer> aA : A) {

                get = Arrays.binarySearch(aA.toArray(), mid);

                if (get < 0) {
                    get = Math.abs(get) - 1;
                } else {
                    while (get < c && aA.get(get) == mid) {
                        get++;
                    }
                }

                place = place + get;
            }

            if(place < desired){
                min = mid + 1;
            }
            else{
                max = mid;
            }
        }

        return min;
    }
}
