package BinarySearch;

import java.util.List;

/**
 * Author - archit.s
 * Date - 02/10/18
 * Time - 10:06 AM
 */
public class CountElements {

    int bSearch(List<Integer> A, boolean searchFirst, int B){
        int low = 0;
        int high = A.size()-1;
        int result = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(A.get(mid) == B){
                result = mid;
                if(searchFirst){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else if(A.get(mid) > B){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return result;
    }

    public int findCount(final List<Integer> A, int B) {

        int left = bSearch(A,true,B);
        int right = bSearch(A,false,B);

        if(left == -1){
            return 0;
        }

        return right-left + 1;
    }

}
